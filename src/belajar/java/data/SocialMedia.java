package belajar.java.data;

class SocialMedia {
    String name;
}
class Facebook extends SocialMedia{
    final void login(String name, String password){
        //isi method
    }
}

//Error
//class FakeFacebook extends Facebook{
//    void login(String name, String password){
//        //isi method
////        you cannot implement final method from the parent class,
////        the 'final' key means final or the latest
//    }
//}
