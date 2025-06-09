### 设计模式之方法工厂模式


#### 工厂方法
相比简单工厂， 工厂方法是是由多个工厂组成，不是单一的一个。每个工厂负责生产具体的实体类的创建。
方法工厂主要有以下特点：
* 定义抽象工厂接口，每个产品有对应的工厂子类
* 通过工厂子类创建具体产品
* 符合开闭原则（增加新产品只需添加新工厂）
简单代码如下：
```java
public abstract class BaseObject {
    public abstract void action();
}

public class CorrectObjectA extends BaseObject{
    public void action() {
        System.out.println("CorrectObjectA");
    }
}

public class CorrectObjectB extends BaseObject{
    public void action() {
        System.out.println("CorrectObjectB");
    }
}

public abstract class BaseObjectFactory {
    public abstract BaseObject create();
}

public class BaseObjectFactoryA {
    public BaseObject create() {
        return new CorrectObjectA();
    }
}

public class BaseObjectFactoryB {
    public BaseObject create() {
        return new CorrectObjectB();
    }
}


public class Client {
    public static void main(String[] args) {
        BaseObjectFactory factoty = new BaseObjectFactoryA();
        BaseObject obj = factory.create();
    }
}

```

在 Spring 中经典的使用就是BeanFactory， 这个是Bean创建的顶级工厂的定义， 类比示例的 BaseObjectFactory。
例如：
DefaultListableBeanFactory 就是 BeanFactory 一个实现


FactoryBean 就是怎样顶级实体类的定义，类比示例的 BaseObject。 在Spring中用于复杂Bean的创建。
例如：
SqlSessionFactoryBean

