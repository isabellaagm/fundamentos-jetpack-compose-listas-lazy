package isabellaagm.com.github.fundamentos_jetpack_compose_listas_lazy.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import isabellaagm.com.github.fundamentos_jetpack_compose_listas_lazy.model.Game

@Composable
fun StudioCard(game: Game, onClick: (() -> Unit)? = null) {
    Card(modifier = Modifier
        .size(100.dp)
        .padding(end = 4.dp)
        .clickable(enabled = onClick != null) { onClick?.invoke() }) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = game.studio)
        }
    }
}