package ru.test.doktorov.androidtest.app;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.test.doktorov.androidtest.mvp.models.Repositories;

public interface GithubApi {
    Integer PAGE_SIZE = 50;

    @GET("/search/repositories?sort=stars&order=desc")
    Call<Repositories> searchUsers(@Query("q") String query, @Query("page") int page, @Query("per_page") int per_page);
}
