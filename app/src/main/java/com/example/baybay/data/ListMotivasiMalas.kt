package com.example.baybay.data

import com.example.baybay.R
import com.example.baybay.model.MotivasiMalas

class ListMotivasiMalas {
    fun loadMotivasiMalas(): List<MotivasiMalas> {
        return listOf<MotivasiMalas>(
            MotivasiMalas(R.drawable.image1, R.string.affirmation1),
            MotivasiMalas(R.drawable.image2, R.string.affirmation2),
            MotivasiMalas(R.drawable.image3, R.string.affirmation3),
            MotivasiMalas(R.drawable.image4, R.string.affirmation4),
            MotivasiMalas(R.drawable.image5, R.string.affirmation5),
            MotivasiMalas(R.drawable.image6, R.string.affirmation6),
            MotivasiMalas(R.drawable.image7, R.string.affirmation7),
            MotivasiMalas(R.drawable.image8, R.string.affirmation8),
            MotivasiMalas(R.drawable.image9, R.string.affirmation9),
            MotivasiMalas(R.drawable.image10, R.string.affirmation10)
        )
    }
}