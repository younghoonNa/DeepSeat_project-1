package com.deepseat.server.DeepSeatServer.dao

import com.deepseat.server.DeepSeatServer.vo.Observation
import org.apache.ibatis.annotations.Param
import org.springframework.stereotype.Repository

@Repository
interface ObservationMapper {

    public fun insertObservation(observation: Observation)
    public fun getObservationsByDay(
        @Param("roomID") roomID: Int,
        @Param("seatID") seatID: Int,
        @Param("date") date: String
    ): List<Observation>

}