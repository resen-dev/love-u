package com.example.loveu.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun NamesCard(
    name1: String, name2: String
){
    Text(
        text = "$name1 & $name2",
        style = MaterialTheme.typography.displayLarge,
        textAlign = TextAlign.Center,
        color = Color(android.graphics.Color.parseColor("#ece213")),
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold
    )
}