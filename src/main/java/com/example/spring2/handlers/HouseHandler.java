package com.example.spring2.handlers;

import com.example.spring2.dtos.request.Room;
import com.example.spring2.dtos.response.houseDTOs.MetersRoomDTO;

import java.util.ArrayList;

public class HouseHandler {
    public static int calculateMeters(ArrayList<Room> listR) {
        int total = 0;
        for(Room room : listR){
            total += room.getLength() * room.getWidth();
        }
        return total;
    }

    public static String calculatePrice(ArrayList<Room> listR){
        int priceMeter = 800;
        int totalMeters = calculateMeters(listR);
        int priceHouse = priceMeter * totalMeters;
        return "USD " + priceHouse;
    }

    public static Room findBiggestRoom(ArrayList<Room> listRooms) {
        Room biggest = listRooms.get(0);
        int squareMetersB = biggest.getLength() * biggest.getWidth();
        for(Room r : listRooms){
            int squareMeters = r.getLength() * r.getWidth();
            if(squareMeters > squareMetersB){
                biggest = r;
            }
        }
        return biggest;
    }

    public static ArrayList<MetersRoomDTO> calculateMetersRooms(ArrayList<Room> listRooms) {
        int totalMeters = 0;
        ArrayList<MetersRoomDTO> array = new ArrayList<>();
        for(Room room : listRooms){
            totalMeters = room.getLength() * room.getWidth();
            MetersRoomDTO metersRoomDTO = new MetersRoomDTO(room, totalMeters);
            array.add(metersRoomDTO);
        }

        return array;
    }
}
