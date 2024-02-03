package com.example.loveu.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color

@Composable
fun HearthShape() {
    var scale by remember { mutableStateOf(1f) }

    val infiniteTransition = rememberInfiniteTransition()

    val pulseAnimation by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.1f,
        animationSpec = infiniteRepeatable(
            animation = tween(700, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ), label = ""
    )

    scale = pulseAnimation

    Icon(
        imageVector = Icons.Filled.Favorite,
        contentDescription = "LoveU",
        modifier = Modifier
            .aspectRatio(1f)
            .scale(scale)
            .clip(CircleShape),
        tint = Color(android.graphics.Color.parseColor("#f11b0e"))
    )
}
