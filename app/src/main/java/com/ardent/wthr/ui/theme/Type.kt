package com.ardent.wthr.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ardent.wthr.R

// Set of Material typography styles to start with

val OswaldFont = FontFamily(listOf(
    Font(R.font.oswald)
))
val PoppinsFont = FontFamily(listOf(
    Font(R.font.poppins)
))


val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = OswaldFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)