### 设计模式之构造者模式

#### Builder(构造者模式)
构造者模式相对来说，有点复杂。主要帮助创建复杂的类的创建。   
涉及的角色有：Director， Builder， CorrectBuilder
* Director 指挥者
* Builder 构造模型
* CorrectBuilder 具体的构造者


使用的场景： 
* 在一个类有很多属性时，通过构造函数时，参数太多，有代码规范函数的参数不能超过5个等
这时候可以构造者来完成对象实体的创建。
* 在 ElasticSearch 开发时，大部分些对象的创建都是采用构造者方式来创建，屏蔽了复杂的对象组装过程。

代码举例最多的汽车为例    
Director： 提供获取具体的车型的入口     
提供的车型：SuvCar，MpvCar     

Builder：提供构造车的入口     

SuvCarBuiider     

MpvCarBuilder     

Car: 构建对象     
component: 构建Car的配件        

不知道看到代码是否又熟悉感，在实际使用中，可能没有Director，比如说当构造实现就一个的时候，    
例如： 在构建 PO 对象的时候    
```java
import lombok.Data;
@Data
public class UserPo {

    private String name;

    private String email;

    private String nick;


    private String signure;

    private String sex;


    private int age;


    private String phone;


    public static UserPoBuilder builder() {
        return new UserPoBuilder();
    }


    final static class UserPoBuilder {
        private final UserPo user;

        public UserPoBuilder() {
            this.user = new UserPo();
        }

        public UserPoBuilder name(String name) {
            this.user.setName(name);
            return user;
        }

        // 省略其余属性的设置

        public UserPo build() {
            return this.user;
        }

    }

}

```







