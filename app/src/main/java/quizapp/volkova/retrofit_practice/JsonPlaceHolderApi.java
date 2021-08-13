package quizapp.volkova.retrofit_practice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();

    //@GET("posts/2/comments")
    //Call<List<Comment>> getComments();

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id")int postId);
}
