package io.github.aerocyber.learning.android.composearticle.challenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import io.github.aerocyber.learning.android.composearticle.challenge.ui.theme.ComposeArticleChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleChallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DoUI(
                        stringResource(id = R.string.header),
                        stringResource(id = R.string.p1),
                        stringResource(id = R.string.p2)
                    )
                }
            }
        }
    }
}

@Composable
fun DoUI(header: String, para1: String, para2: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            header,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = para1,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                ),
            textAlign = TextAlign.Justify
        )
        Text(
            text = para2,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleChallengeTheme {
        DoUI(
            stringResource(id = R.string.header),
            stringResource(id = R.string.p1),
            stringResource(id = R.string.p2)
        )
    }
}