package com.viniciusp.tarefasretrofit.domain

import com.viniciusp.tarefasretrofit.data.model.Tarefa
import retrofit2.Response
import retrofit2.http.*

interface TarefaService {

    @GET("tarefa")
    suspend fun buscarTarefas() : Response<List<Tarefa>>

    @GET("tarefa/{idTarefa}")
    suspend fun buscarTarefa(
        @Path("idTarefa") idTarefa: Int
    ) : Response<Tarefa>

    @POST("tarefa")
    suspend fun adicionarTarefa(
        @Body tarefa: Tarefa
    ) : Response<Tarefa>

    @DELETE("tarefa/{idTarefa}")
    suspend fun excluirTarefa(
        @Path("idTarefa") idTarefa: Int
    )
}