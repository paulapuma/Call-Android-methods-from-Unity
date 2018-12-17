package dsa.eetac.upc.edu;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface APIRest {
    //We specify the url
    String BASE_URL = "http://147.83.7.155:8080/dsaApp/";

/*
    @GET("level")
    Call<int> getLevel();*/

    /*//We add the GET method to obtain all the tracks in the list
    @GET("tracks")
    Call<List<Track>> getAllTracks();
    */

    //We add the POST method to add a new track
    @POST("tracks")
    Call<List<Track>> addTrack(@Body Track track);

    //We add the PUT method to modify the parameters of a track
    //@PUT("tracks")


    //We add the DELETE method to delete a track given its id
    //@DELETE("tracks/{id}")


}
