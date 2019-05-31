package com.example.qiitaclient.client

import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import com.example.qiitaclient.model.Article

interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}