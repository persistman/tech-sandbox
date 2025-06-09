### 设计模式之抽象工厂模式


#### 静态工厂
一般是直接调用工厂的方法，直接创建一个对象, 如下简单代码如下:

```java
public static Object createObject() {
    return new Object();
}
```
最常用的地方，一般在工具类中。比如考虑到线程安全问题， 时间格式化的时候用的是SimpleDateFormat来格式化Date对象。
例如这样写：
```java
public class DateFormateUtil {

    private static final String DEFAULT_FORMAT = 'yyyy-MM-dd HH:mm:ss';

    public static SimpleDateFormat getFormat() {
        return new SimplateDateFormat(DEFAULT_FORMAT);
    }

    public static SimpleDateFormat getFormat(String format) {
        String f = StringUtils.hasText(format) ? format :  DEFAULT_FORMAT;
        return new SimplateDateFormat(f);
    }

}
```

#### 简单工厂
简单工厂相比静态工厂，要复杂一些，产出的对象也更多了，但都属于同一个基类。
简单工厂模式的核心特点：
* 工厂类通常只有一个创建方法
* 通过参数来决定创建哪种具体产品
* 客户端不需要知道具体产品类
简单实现代码如下：
```java
public abstract class BaseObject {

    public abstract void action();
}


public class CorrectBaseObjectA extends BaseObject {

    public void action() {
        // do actionA
    }
}

public class CorrectBaseObjectB extends BaseObject {

    public void action() {
        // do actionB
    }
}


public class SimpleBaseObjectFactory {

    public static BaseObject getBaseObject(String objectType) {
        if("A".equals(objectType)) {
            return new CorrectBaseObjectA();
        } else if("B".equals(objectType)) {
            return new CorrectBaseObjectB();
        } 

        return null;
    }
}

```

#### 方法工厂
从简单工厂的实现可以看出， 简单工厂需要提供生产的统一入口(因为客户端并需要需要知道具体的产品是啥，或者怎么创建具体的产品)，这使得在工厂的创建的方法里面  
必须知道创建什么类型的产品，这种实现需要通过if-else 或者 switch 来实现。这样使得每每有新的产品或者实体类，都的添加判断或者case 语句。  
这明显违反了开闭原则。

方法工厂是对简单工厂的再次抽象， 将工厂的行为再次抽象。提供顶级的工厂的行为， 由具体的行为具体的工厂来负责实现。

具体参考 [methodFactory.md](method/MethodFactory.md)

#### 抽象工厂
如果说方法工厂是单个产品的生产，那么抽象工厂就是产品簇的生产，注重的是产品的关联性。
比如餐馆类比工厂， 菜单上的菜品类比具体的产品， 同一道菜品，不同餐馆制作也是不一样的。
四川菜馆的麻婆豆腐，辣椒炒肉的制作
湖南菜馆的麻婆豆腐，辣椒炒肉的制作


比如菜单的实现，不通语言对相同的控件实现也不一样，比如 Button
GUI 类比工厂，不通的控件类比具体的产品
Java  通过 awt 或者 swing 实现
HTML  通过<input> 标签实现

.....

具体参考 [abstractFactory.md](abs/AbstractFactory.md)



