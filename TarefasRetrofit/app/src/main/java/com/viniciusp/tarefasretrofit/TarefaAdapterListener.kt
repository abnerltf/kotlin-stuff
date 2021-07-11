package com.viniciusp.tarefasretrofit

import com.viniciusp.tarefasretrofit.data.model.Tarefa

interface TarefaAdapterListener {
    fun excluirTarefa(tarefa: Tarefa)
}
