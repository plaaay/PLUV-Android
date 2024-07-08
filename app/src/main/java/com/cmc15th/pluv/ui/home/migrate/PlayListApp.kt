package com.cmc15th.pluv.ui.home.migrate

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.cmc15th.pluv.R

sealed class PlayListApp(
    @DrawableRes val appIcon: Int,
    @StringRes val appName: Int,
    val onItemClick: () -> Unit
) {
    data object Empty : PlayListApp(
        appIcon = R.drawable.grayplaceholder,
        appName = R.string.empty,
        onItemClick = {}
    )
    class Spotify(onItemClick: () -> Unit = {}) : PlayListApp(
        appIcon = R.drawable.spotify,
        appName = R.string.spotify,
        onItemClick = onItemClick
    )

    class AppleMusic(onItemClick: () -> Unit = {}) : PlayListApp(
        appIcon = R.drawable.applemusic,
        appName = R.string.apple_music,
        onItemClick = onItemClick
    )

    class YouTubeMusic(onItemClick: () -> Unit = {}) : PlayListApp(
        appIcon = R.drawable.youtubemusic,
        appName = R.string.youtube_music,
        onItemClick = onItemClick
    )
}