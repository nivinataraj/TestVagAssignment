# TestVagAssignment

In this code execution, 
The class RecentlyPlayedSongs carries a MAP where the keys are Users and the values are the linkedlist of songs that has been played recently.
The capacity parameter defines the capacity of the storage which is passed to the conductor.
The addSong method appends a new song to user's recently played list, while ensuring that the list doesn't outpaced the capacity. 
If the list is already at its capacity,the song played recently will be removed before appendig the new one.
The getRecentlyPlayed method retrives the recently played list for the user.
