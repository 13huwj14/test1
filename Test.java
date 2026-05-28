
public class SuperMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====  简 易 超 市 购 物 管 理 系 统  =====");
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        User user = new User(username,password);
        if(user.login(username,password)){
            System.out.println("登录成功！欢迎使用系统~");
        }
        else{
            System.out.println("用户名或密码错误，登录失败！");
        }
        Food food = new Food ("1","薯片",10,2,"食品","2020-06-17");
        //依次显示商品id，商品名称，商品类型，商品单价，购买数量，折扣前总额，折扣后总额，一行一行展示
        System.out.println("商品id："+food.getId());
        System.out.println("商品名称："+food.getName());
        System.out.println("商品类型："+food.getType());
        System.out.println("商品单价："+food.getPrice()+"元");
        System.out.println("购买数量："+food.getBuynum());
        System.out.println("折扣前总额："+ food.getPrice()*food.getBuynum()+"元");
        System.out.println("折扣后总额："+food.getTotal()+"元");
    }

}
