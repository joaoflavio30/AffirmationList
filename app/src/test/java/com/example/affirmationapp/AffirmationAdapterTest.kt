package com.example.affirmationapp

import com.example.affirmationapp.adapter.ItemAdapter
import com.example.affirmationapp.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationAdapterTest {
    private val context = mock(android.content.Context::class.java)

    @Test
    fun adapterSize() {
        val dataTest = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context,dataTest)

        assertEquals("ItemAdapter is not the correct size",dataTest.size,adapter.itemCount)
    }
}