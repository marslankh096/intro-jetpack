package com.app.financeappjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
@Preview(showBackground = true)
fun IntroScreen(
    onStartClick: () -> Unit = {}
) {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (image, title) = createRefs()

        // Background Image
        Image(
            painter = painterResource(id = R.drawable.intro_pic),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .constrainAs(image) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
                .fillMaxSize()
        )

        // Title Text
        Text(
            text = "The Best Finance App",
            modifier = Modifier.constrainAs(title) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom ) // thoda upar laya niche se
            }
        )
    }
}
