package oop_127511_vierza.week07

enum class AppState {STARTING, RUNNING, STOPPPED}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}