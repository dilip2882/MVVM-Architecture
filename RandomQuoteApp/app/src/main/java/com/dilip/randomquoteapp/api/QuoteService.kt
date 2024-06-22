package com.dilip.randomquoteapp.api

import com.dilip.randomquoteapp.models.QuoteList
import retrofit2.Response
import retrofit2.http.GET

interface QuoteService {

    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>
}