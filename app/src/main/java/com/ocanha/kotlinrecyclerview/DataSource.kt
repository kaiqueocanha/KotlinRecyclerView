package com.ocanha.kotlinrecyclerview

import com.ocanha.kotlinrecyclerview.models.Live

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<Live>{
            val list = ArrayList<Live>()
            list.add(
                Live(
                    "LIVE #001 - Como ter um perfil de desenvolvedor campeão no Linkedin",
                    "Kaique Ocanha",
                    "https://i3.ytimg.com/vi/7jvIJPgpcPs/maxresdefault.jpg",
                    "https://youtu.be/7jvIJPgpcPs"
                )
            )
            list.add(
                Live(
                    "LIVE #002 - A arte de escrever programas legíveis! + 20 dicas práticas! (PARTE 1)",
                    "Kaique Ocanha",
                    "https://i3.ytimg.com/vi/gaLOFIwDFLI/maxresdefault.jpg",
                    "https://youtu.be/gaLOFIwDFLI"
                )
            )
            list.add(
                Live(
                    "LIVE #003 - A arte de escrever programas legíveis! + 20 dicas práticas! - (PARTE 2)",
                    "Kaique Ocanha",
                    "https://i3.ytimg.com/vi/VBfs42u4QKA/maxresdefault.jpg",
                    "https://youtu.be/VBfs42u4QKA"
                )
            )
            list.add(
                Live(
                    "LIVE #004 - Desenvolvedor Android Júnior: o que você precisa saber!",
                    "Kaique Ocanha",
                    "https://i3.ytimg.com/vi/gLNzLRqHF8c/maxresdefault.jpg",
                    "https://youtu.be/gLNzLRqHF8c"
                )
            )
            list.add(
                Live(
                    "LIVE #005 - Criando e publicando seu primeiro app Android!",
                    "Kaique Ocanha",
                    "https://i3.ytimg.com/vi/PRmkgeX5pOs/maxresdefault.jpg",
                    "https://youtu.be/PRmkgeX5pOs"
                )
            )
            list.add(
                Live(
                    "LIVE #006 - Dominando o RecyclerView com Kotlin no Android!",
                    "Kaique Ocanha",
                    "https://i3.ytimg.com/vi/EB32R-u_tac/maxresdefault.jpg",
                    "https://youtu.be/EB32R-u_tac"
                )
            )
            return list
        }

    }

}