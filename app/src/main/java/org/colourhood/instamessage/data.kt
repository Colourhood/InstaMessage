package org.colourhood.instamessage

/**
 * Create a Activity that that create a list with
 * RecyclerView that tiles the movies fetched from the url below.
 * All calls to API and loading an image should be asynchronousCreate a
 * Activity that that create a list with RecyclerView that tiles the movies
 * fetched from the url below.  All calls to API and loading an image should be asynchronous
 */
//object Model {
//    // TODO: use Retrofit to make the HTTP call the build the connection
//   // the query.
//    data class Result(val query : Query)
//    data class Query(val searchinfo: SearchInfo)
//    data class SearchInfo(val totalHits: Int)
//}

// Create Data Classes that only design to hold data
// just like a struct in C
data class User(
        val vote_count: Long,
        val id: Long,
        val video: Boolean,
        val vote_average: Long,
        val title: String,
        val popularity: Double,
        val poster_path: String,
        val original_language: String,
        val original_title: String
)

data class Result (val title: String, val poster_path: String )


