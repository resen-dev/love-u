package com.example.loveu.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalDate
import java.time.temporal.ChronoUnit

@Composable
fun DaysCard(
    startNamoro: LocalDate
){
    val today: LocalDate = LocalDate.now()

    fun calculateDaysDifference(): String {
        return ChronoUnit.DAYS.between(startNamoro, today).toString()
    }

    fun calculateMonthsDifference(): String {
        return ChronoUnit.MONTHS.between(startNamoro, today).toString()
    }

    fun calculateYearsDifference(): String {
        val monthsDifference = ChronoUnit.MONTHS.between(startNamoro, today).toDouble()
        val yearsDifference = monthsDifference / 12.0
        return String.format("%.1f", yearsDifference)
    }

    val daysDifference = calculateDaysDifference()
    val monthsDifference = calculateMonthsDifference()
    val yearsDifference = calculateYearsDifference()

    val textColor = Color.LightGray
    val cardColor = Color(android.graphics.Color.parseColor("#692c31"))

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
        ,
        colors = CardDefaults.cardColors(containerColor = cardColor),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp)),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = daysDifference,
                fontSize = 32.sp,
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 0.dp
                    )
                    .alignByBaseline(),
                color = textColor
            )

            Text(
                text = "Dias",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 0.dp
                    )
                    .alignByBaseline(),
                color = textColor
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(cardColor),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = monthsDifference,
                fontSize = 32.sp,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 0.dp
                    )
                    .alignByBaseline(),
                color = textColor
            )

            Text(
                text = "Meses",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 0.dp
                    )
                    .alignByBaseline(),
                color = textColor
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(cardColor),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = yearsDifference,
                fontSize = 32.sp,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 8.dp
                    )
                    .alignByBaseline(),
                color = textColor
            )

            Text(
                text = "Anos",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 8.dp
                    )
                    .alignByBaseline(),
                color = textColor
            )
        }
    }
}

