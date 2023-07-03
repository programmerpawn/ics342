package com.example.ics342
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    WeatherView()
        }
    }
}

//creates the wheatherView function.
@Composable
fun WeatherView() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(10.dp)

        )
        //Sets the location where the temperature is located
        Text(
            text = stringResource(id = R.string.myLocation),
            fontSize = 15.sp,
            modifier = Modifier.padding(10.dp)
        )


        Row {
            Column(modifier = Modifier.padding(5.dp)) {
                //Sets the current Temp
                Text(
                    text = stringResource(id = R.string.currentTempData),
                    fontSize = 45.sp
                )
                //Sets the "feels like" temp
                Text(
                    text = stringResource(id = R.string.feelsLike),
                    fontSize = 15.sp
                )
                Spacer(modifier = Modifier.height(25.dp))

                //other information about the weather
                Text(
                    text = stringResource(id = R.string.dailyLow)
                )
                Text(
                    text = stringResource(id = R.string.dailyHigh)
                )
                Text(
                    text = stringResource(id = R.string.humidity)
                )
                Text(
                    text = stringResource(id = R.string.stringPressure)
                )

            }

            Column(modifier = Modifier.padding(5.dp)) {
                //Sets the picture
                val imageMod = Modifier
                    .size(75.dp)
                Image(
                    painter = painterResource(id = R.drawable.sunny),
                    contentDescription = "sun",
                    contentScale = ContentScale.FillBounds,
                    modifier = imageMod

                )
            }

        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        WeatherView()
}
