package com.example.exampleeee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.size.Scale
import com.example.exampleeee.ui.theme.*
import dev.chrisbanes.accompanist.coil.CoilImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExampleeeeTheme {
                CardScreen()
            }
        }
    }
}

@Composable
fun CardScreen(){
    Surface(color = background, elevation = 4.dp) {
        Column {
            Row(
                modifier = Modifier
                    .height(80.dp)
                    .fillMaxWidth()
                    .padding(end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(id = R.string.app_name),
                    style = MaterialTheme.typography.h5,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(
                            start = 24.dp,
                            end = 24.dp,
                            top = 24.dp,
                            bottom = 8.dp
                        )
                )
            }

            Card(
                modifier = Modifier
                    .padding(start = 4.dp, end = 4.dp, top = 4.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(20.dp)),
                elevation = 8.dp
            ) {
                Row {
                    Column {
                        Row {
                            AgeChip()
                            GenderIcon()
                        }
                        BehaviourChip()
                        Text(
                            text = "ooıoıoı",
                            style = MaterialTheme.typography.h6,
                            modifier = Modifier
                                .padding(start = 8.dp, end = 8.dp)
                                .width(120.dp),
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "ppppepepepepep",
                            style = MaterialTheme.typography.body2,
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 0.dp)
                        )
                        Text(
                            text = "sjksksksksksksl",
                            style = MaterialTheme.typography.body2,
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 0.dp, bottom = 8.dp)
                        )
                        Text(
                            text = "kksksksjdknjd",
                            style = MaterialTheme.typography.body2,
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 0.dp, bottom = 8.dp)
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                            .clip(
                                RoundedCornerShape(
                                    topStart = 120.dp,
                                    topEnd = 20.dp,
                                    bottomStart = 0.dp,
                                    bottomEnd = 20.dp
                                )
                            )
                    )
                }
            }
        }
    }
}

@Composable
fun AgeChip() {
    Chip(
        text = "Puppy",
        color = purpleButtonLight,
        textColor = Purple500,
        modifier = Modifier
            .padding(start = 8.dp, top = 24.dp)
            .width(60.dp)
    )
}


@Composable
fun Chip(
    text: String,
    color: Color,
    textColor: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(24.dp)
            .clip(
                RoundedCornerShape(
                    CornerSize(12.dp),
                    CornerSize(12.dp),
                    CornerSize(12.dp),
                    CornerSize(12.dp)
                )
            )
            .background(color),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 12.dp, end = 12.dp, bottom = 4.dp),
            style = MaterialTheme.typography.caption,
            color = textColor
        )
    }
}

@Composable
fun GenderIcon() {
    Image(
        painter = painterResource(R.drawable.ic_baseline_menu_24),
        contentDescription = "male",
        modifier = Modifier
            .size(42.dp)
            .padding(start = 8.dp, end = 8.dp, top = 30.dp, bottom = 0.dp)
    )
}

@Composable
fun BehaviourChip() {
    Chip(
        text = "Loyal",
        color = behaviourBackground,
        textColor = behaviourTextColor,
        modifier = Modifier.padding(start = 8.dp, top = 4.dp)
    )
}



@Preview(showBackground = true)
@Composable
fun CardPreview(){
    ExampleeeeTheme {
        CardScreen()
    }
}
