package lesson14;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lolik on 2/15/18.
 */
public class ImdbParser {


    OkHttpClient client = new OkHttpClient();

    public String getRequest(String url) throws IOException {
        Request request = new Request.Builder()
                .addHeader("Accept-Language", "en-US,en;q=0.5")
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public List<String> movieUrls = new ArrayList<>();

    List<Movie> movies = new ArrayList<>();

    @Test
    public void parse() throws IOException {
        getTopMoviesUrl();
        for (String url : movieUrls) {
            Movie movie = parseMovie(url);
            System.out.println(movie);
            movies.add(movie);
        }


    }

    public void getTopMoviesUrl() throws IOException {
        String html = getRequest("https://www.imdb.com/chart/top");
        Document doc = Jsoup.parse(html);
        Elements elements = doc.select(".titleColumn a");
        for (Element element : elements) {
            String href = element.attr("href");
            movieUrls.add(href);
        }
    }


    public Movie parseMovie(String url) throws IOException {
        Movie movie = new Movie();
        String html = getRequest("https://www.imdb.com" + url);
        Document doc = Jsoup.parse(html);
        movie.title = doc.select(".title_wrapper h1").get(0).text();
            try {
                movie.rating = Double.parseDouble(doc.select(".imdbRating [itemprop='ratingValue']").get(0).text());
                movie.metascore = Double.parseDouble(doc.select(".metacriticScore span").get(0).text());
                movie.year = Integer.parseInt(doc.select("#titleYear a").get(0).text());
                movie.director = doc.select("[itemprop='director'] span").get(0).text();
                movie.actors = getActors(doc);
            } catch (Exception e){
                System.out.println(movie.title);
                throw e;
            }
        return movie;
    }

    public List<String> getActors(Document doc) {
        List<String> actors = new ArrayList<>();
        Elements select = doc.select(".cast_list [itemprop='name']");
        for(Element element : select){
            actors.add(element.text());
        }
        return actors;
    }


}
