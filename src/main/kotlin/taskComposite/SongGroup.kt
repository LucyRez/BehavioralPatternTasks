package taskComposite


class SongGroup(val groupName: String, val groupDescription: String) {
    var songComponents: MutableList<Song> = mutableListOf<Song>();
    fun add(newSongComponent: Song) {
        songComponents.add(newSongComponent)
    }

    fun remove(newSongComponent: Song) {
        songComponents.remove(newSongComponent)
    }

    fun getComponent(componentIndex: Int): Song {
        return songComponents[componentIndex]
    }

    fun displaySongInfo() {
        // TODO: Desplay info about all songs and songs components
        //  inside songComponents list

    }



}