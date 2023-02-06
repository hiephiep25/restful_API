package GetListAuction;

public class GetListAuctionClass {
        public int code;
        public String message;
        public Data data;
}
class Data{
    public Auction[] auctions;
    public User user_info;
    public String type;
    public String category;
    public String total;
}

class Auction{
    public String auction_id;
    public String selling_user_id;
    public String title;
    public String start_date;
    public String end_date;
    public String statusId;
    public String status;
    public Category category;
}
class Category{
    public String name;
    public String image;
    public String type;
}
class User{
    public String name;
    public String avatar;
    public String phone;
    public String email;
    public String role;
    public String address;
}
