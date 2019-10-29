package t1708e.webservice.client.serviceData;

import t1708e.webservice.client.service.Place;
import t1708e.webservice.client.service.PlaceImage;
import t1708e.webservice.client.entity.StatusEnum;

import java.util.ArrayList;
import java.util.List;

public class PlaceImageService {
    private static List<PlaceImage> placeImageList = new ArrayList<>();
    private static int increment = 1;

    public void  init(PlaceService placeService) {
        List<Place> places = placeService.findAll();
        for (Place place : places) {
            placeImageList.add(new PlaceImage(increment, place, "http://localhost:8080/images/offer_"+ increment++ +".jpg", (float)4.5, StatusEnum.ACTIVE.name()));
        }
    }

    public List<PlaceImage> findAll() {
        return placeImageList;
    }

    public PlaceImage save (PlaceImage placeImage) {
        placeImage.setId(increment++);
        placeImageList.add(placeImage);
        return placeImage;
    }

    public PlaceImage findById(int id) {
        if (id > placeImageList.size()) {
            return null;
        }
        return placeImageList.get(id-1);
    }

    public List<PlaceImage> findByPlaceId(int id) {
        List<PlaceImage> placeImageListResult = new ArrayList<>();
        for (PlaceImage placeImage : placeImageList) {
            if (placeImage.getPlace().getId() == id) {
                placeImageListResult.add(placeImage);
            }
        }
        return placeImageListResult;
    }

    public PlaceImage update(int id, PlaceImage placeImage) {
        if (id > placeImageList.size()) {
            return null;
        }
        placeImageList.set(id - 1, placeImage);
        return placeImage;
    }
}
