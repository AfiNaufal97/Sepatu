package com.plugin.sepatu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plugin.sepatu.model.listImage
import com.plugin.sepatu.styles.FontStyles
import com.plugin.sepatu.styles.MyColors
import com.plugin.sepatu.ui.theme.SepatuTheme
import com.plugin.sepatu.widget.BoxSizeWidget
import com.plugin.sepatu.widget.CircleColorWidget
import com.plugin.sepatu.widget.TextWidget

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SepatuTheme {
                Home()
            }
        }
    }
}

@Composable
fun Home() {
    val scroll = rememberScrollState(
        initial = 0
    )


    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(
                state = scroll
            )

    ) {

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = stringResource(id = R.string.background_app),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 27.dp)
        ) {

            Image(
                painter = painterResource(id = listImage().get(0).image),
                contentDescription = "Image"
            )

            Spacer(modifier = Modifier.height(30.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Box(
                    modifier = Modifier
                        .width(30.dp)
                        .height(3.dp)
                        .background(MyColors.Black)
                )
                Box(
                    modifier = Modifier
                        .width(30.dp)
                        .height(3.dp)
                        .background(MyColors.Grey)
                )
            }

            TextWidget(
                modifier = Modifier.padding(top = 92.dp),
                text = stringResource(id = R.string.vans),
                color = Color.Gray,
                weight = FontWeight.Medium,
                size = 17
            )

            TextWidget(
                modifier = Modifier,
                text = stringResource(id = R.string.old_skool),
                color = Color.Black,
                weight = FontWeight.SemiBold,
                size = 28
            )

            TextWidget(
                modifier = Modifier.padding(top = 8.dp),
                text = stringResource(id = R.string.desc),
                color = Color.Gray,
                weight = FontWeight.Medium,
                size = 15
            )

            TextWidget(
                modifier = Modifier.padding(top = 40.dp),
                text = stringResource(id = R.string.size),
                color = Color.Gray,
                weight = FontWeight.Medium,
                size = 15
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    BoxSizeWidget(
                        text = 7,
                        modifier = Modifier,
                        color = Color.Black,
                        weight = FontWeight.Medium,
                        fontSize = 14,
                        size = {
                            // state
                        }
                    )

                    BoxSizeWidget(
                        text = 8,
                        modifier = Modifier,
                        color = Color.Black,
                        weight = FontWeight.Medium,
                        fontSize = 14,
                        size = {
                            // state
                        }
                    )

                    BoxSizeWidget(
                        text = 9,
                        modifier = Modifier,
                        color = Color.Black,
                        weight = FontWeight.Medium,
                        fontSize = 14,
                        size = {
                            // state
                        }
                    )

                }

                Text(
                    text = "\$ 97", style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 28.sp,
                        color = Color.Black,
                        fontFamily = FontStyles.family
                    )
                )

            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    TextWidget(
                        modifier = Modifier.padding(top = 40.dp),
                        text = stringResource(id = R.string.color),
                        color = Color.Gray,
                        weight = FontWeight.Medium,
                        size = 15
                    )
                    Row {
                        CircleColorWidget(color = Color.Black, clicColor = {
                            // state
                        })
                        CircleColorWidget(color = Color.Red, clicColor = {
                            // state
                        })
                    }

                }

                Button(modifier = Modifier
                    .width(170.dp)
                    .height(65.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                    onClick = {
                        // state
                    }) {
                    TextWidget(
                        modifier = Modifier,
                        text = stringResource(id = R.string.add_cart),
                        color = Color.Gray,
                        weight = FontWeight.SemiBold,
                        size = 20
                    )
                }
            }


        }
    }
}