package taskComposite


class Song(var songName: String, var bandName: String, var releaseYear: Int) {
    fun displaySongInfo() {
        println("$songName was recorded by $bandName in $releaseYear")
    }
}