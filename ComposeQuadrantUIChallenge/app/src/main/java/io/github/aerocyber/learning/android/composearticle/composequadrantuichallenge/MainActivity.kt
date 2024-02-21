package io.github.aerocyber.learning.android.composearticle.composequadrantuichallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.aerocyber.learning.android.composearticle.composequadrantuichallenge.ui.theme.ComposeQuadrantUIChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantUIChallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DoUI()
                }
            }
        }
    }
}

@Composable
fun DoUI(modifier: Modifier = Modifier) {
    Column (
        Modifier.fillMaxWidth()
    ) {
        Row (Modifier.weight(1f)) {
            ComposableCard(
                title = stringResource(id = R.string.text_head),
                content = stringResource(id = R.string.text_info),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableCard(
                title = stringResource(id = R.string.image_head),
                content = stringResource(id = R.string.image_info),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (Modifier.weight(1f)) {
            ComposableCard(
                title = stringResource(id = R.string.row_head),
                content = stringResource(id = R.string.row_info),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposableCard(
                title = stringResource(id = R.string.column_head),
                content = stringResource(id = R.string.column_info),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ComposableCard (title: String, content:String, color: Color, modifier: Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(text = content, textAlign = TextAlign.Justify, color = Color.Black)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantUIChallengeTheme {
        DoUI()
    }
}