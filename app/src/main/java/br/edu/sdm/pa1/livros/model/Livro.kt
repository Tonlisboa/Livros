package br.edu.sdm.pa1.livros.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Livro(
    val titulo: String,
    val isbn: String,
    val primeiroAutor: String,
    val editora: String,
    val edicao: Int,
    val paginas: Int
): Parcelable

