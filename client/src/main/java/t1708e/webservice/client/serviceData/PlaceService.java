package t1708e.webservice.client.serviceData;

import t1708e.webservice.client.entity.StatusEnum;
import t1708e.webservice.client.service.Category;
import t1708e.webservice.client.service.Place;
import t1708e.webservice.client.service.PlaceImage;
import t1708e.webservice.client.service.User;

import java.util.ArrayList;
import java.util.List;

public class PlaceService {
    private static List<Place> placeList = new ArrayList<>();
    private static int increment = 1;

    public void  init(CategoryService categoryService, UserService userService) {
        Category cate1 = categoryService.findById(1);
        User user1 = userService.findById(1);
        placeList.add(new Place(cate1, increment++, "Đỉnh Phan si Păng", "", "", user1, 4, 250, "345 677 Gran Via Street, no 34, Madrid, Spain"));
        placeList.add(new Place(cate1, increment++, "Đỉnh Maphineg", "", "", user1, 3, 320, "345 677 Gran Via Street, no 34, Madrid, Spain"));
        placeList.add(new Place(cate1, increment++, "Cù Lao chàm", "", "", user1, 5, 420, "345 677 Gran Via Street, no 34, Madrid, Spain"));
        placeList.add(new Place(cate1, increment++, "Three Island", "", "", user1, 4, 420, "345 677 Gran Via Street, no 34, Madrid, Spain"));
        placeList.add(new Place(cate1, increment++, "Coto Island", "", "", user1, 4, 420, "345 677 Gran Via Street, no 34, Madrid, Spain"));
        placeList.add(new Place(cate1, increment++, "Da Lat", "", "", user1, 5, 520, "345 677 Gran Via Street, no 34, Madrid, Spain"));
        for (int i=1; i < 5; i++) {
            Place place = placeList.get(i);
            List<PlaceImage> placeImages = new ArrayList<>();
            placeImages.add(new PlaceImage(i, place, "http://localhost:8080/images/offer_"+ i +".jpg", (float)4.5, StatusEnum.ACTIVE.name()));
            place.setPlaceImages(placeImages);
        }
    }

    public List<Place> findAll() {
        return placeList;
    }

    public Place save (Place Place) {
        Place.setId(increment++);
        placeList.add(Place);
        return Place;
    }

    public Place findById(int id) {
        if (id > placeList.size()) {
            return null;
        }
        System.out.println(placeList.size());
        System.out.println(placeList.get(id-1).getName());
        return placeList.get(id-1);
    }

    public Place update(int id, Place Place) {
        if (id > placeList.size()) {
            return null;
        }
        placeList.set(id - 1, Place);
        return Place;
    }

}
