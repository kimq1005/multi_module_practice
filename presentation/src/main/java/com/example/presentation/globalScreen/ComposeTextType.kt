package com.example.presentation.globalScreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.presentation.R
import com.example.presentation.R.*

//val Pretendard = FontFamily(
//    Font(font.pretendard_regular, FontWeight.Normal, FontStyle.Normal),
//    Font(font.pretendard_bold, FontWeight.Bold, FontStyle.Normal)
//)


enum class TextStyleEnum {
    Title1, Title2, Title3, Title4, Title1Gradient,
    Body1, Body2, Body3,
    TextButton,
    HeadLine0,
    HeadLine1,
    HeadLine2,
    HeadLine3,
    Caption,
    Bold3,
    Normal2,
    Button,
    OverLine,
}

val Int.nonScaledSp
    @Composable
    get() = (this / LocalDensity.current.fontScale).sp

//@OptIn(ExperimentalTextApi::class)
//@Composable
//fun typography(textStyle: TextStyleEnum): TextStyle {
//    return when (textStyle) {
//        TextStyleEnum.Title1 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Bold,
//            fontSize = 20.nonScaledSp,
//            lineHeight = 38.nonScaledSp
//        )
//
//        TextStyleEnum.Title2 -> {
//            TextStyle(
//                fontFamily = Pretendard,
//                fontWeight = FontWeight.Bold,
//                fontSize = 17.nonScaledSp,
//                lineHeight = 23.nonScaledSp
//            )
//        }
//
//        TextStyleEnum.Title3 -> {
//            TextStyle(
//                fontFamily = Pretendard,
//                fontWeight = FontWeight.Bold,
//                fontSize = 15.nonScaledSp,
//                lineHeight = 20.nonScaledSp,
//            )
//        }
//
//        TextStyleEnum.Title4 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Bold,
//            fontSize = 12.nonScaledSp,
//            lineHeight = 16.nonScaledSp,
//        )
//
//        TextStyleEnum.Body1 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Normal,
//            fontSize = 17.nonScaledSp,
//            lineHeight = 23.nonScaledSp,
//        )
//
//        TextStyleEnum.Body2 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Normal,
//            fontSize = 15.nonScaledSp,
//            lineHeight = 22.nonScaledSp,
//        )
//
//
//        TextStyleEnum.Body3 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Normal,
//            fontSize = 12.nonScaledSp,
//            lineHeight = 16.nonScaledSp,
//        )
//
//        TextStyleEnum.TextButton -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Normal,
//            fontSize = 13.nonScaledSp,
//            lineHeight = 18.nonScaledSp
//        )
//
//        TextStyleEnum.HeadLine0 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Bold,
//            fontSize = 40.nonScaledSp,
//            lineHeight = 50.nonScaledSp
//        )
//
//
//        TextStyleEnum.HeadLine1 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Bold,
//            fontSize = 34.nonScaledSp,
//            lineHeight = 46.nonScaledSp
//        )
//
//        TextStyleEnum.HeadLine2 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Bold,
//            fontSize = 26.nonScaledSp,
//            lineHeight = 38.nonScaledSp
//        )
//
//
//        TextStyleEnum.HeadLine3 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Bold,
//            fontSize = 22.nonScaledSp,
//            lineHeight = 30.nonScaledSp
//        )
//
//        TextStyleEnum.Caption -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Normal,
//            fontSize = 12.nonScaledSp,
//            lineHeight = 16.nonScaledSp
//        )
//
//        TextStyleEnum.Bold3 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Bold,
//            fontSize = 12.nonScaledSp,
//            lineHeight = 16.nonScaledSp,
//        )
//
//        TextStyleEnum.Normal2 -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Normal,
//            fontSize = 17.nonScaledSp,
//            lineHeight = 22.nonScaledSp,
//        )
//
//        TextStyleEnum.Button -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Bold,
//            fontSize = 16.nonScaledSp,
//            lineHeight = 22.nonScaledSp,
//        )
//
//        TextStyleEnum.Title1Gradient -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Bold,
//            fontSize = 15.nonScaledSp,
//            lineHeight = 20.nonScaledSp,
//            brush = Brush.verticalGradient(
//                colors = listOf(Color.White, Color(0x0D000000))
//            )
//        )
//
//        TextStyleEnum.OverLine -> TextStyle(
//            fontFamily = Pretendard,
//            fontWeight = FontWeight.Normal,
//            fontSize = 10.nonScaledSp,
//            lineHeight = 14.nonScaledSp,
//        )
//    }
//}
