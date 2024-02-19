# How to create a bean
Open NetBeans IDE and start a new project by going to `File > New Project`, select Java with Java Application, name your project, and finish the setup. Right-click on the Source Packages folder in your project to add a new Java Class, giving it a name that represents the bean.

In your new class, follow the JavaBean conventions by including a no-argument constructor and making it implement the Serializable interface. Define private properties for the data you wish to encapsulate, such as name and age.

For each property, create public getter and setter methods. For instance, for a name property, you would have `getName()` and `setName(String name)` methods. This allows external classes to access and modify the bean's properties in a controlled manner.

```java
public class JButtonPersonalizado extends JButton implements Serializable {

    private Cor cores;
    private CorHover coresHover;

    public JButtonPersonalizado() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(cores.getBackgroundColor());
                setForeground(cores.getTextColor());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(coresHover.getCorHoverFondo());
                setForeground(coresHover.getCorHoverTexto());
            }

        });
    }

    public JButtonPersonalizado(Cor cores, CorHover coresHover) {
        this.cores = cores;
        this.coresHover = coresHover;

    }

    public Cor getCores() {
        return cores;
    }

    public void setCores(Cor cores) {
        this.cores = cores;
        setBackground(cores.getBackgroundColor());
        setForeground(cores.getTextColor());
    }

    public CorHover getCoresHover() {
        return coresHover;
    }

    public void setCoresHover(CorHover coresHover) {
        this.coresHover = coresHover;
    }

}
```

After coding your JavaBean, save your work. NetBeans automatically compiles your files, but you can also manually compile your project by right-clicking on the project name and selecting Build.

Your JavaBean is now ready to be used in your application. You can instantiate it, set its properties using the setter methods, and retrieve its properties using the getter methods.

## Complex attributes
If the bean has complex attributes, like in this case in which the button bean has two complex attributes `cores` and `coresHover`, related to the color of its text and background colors when the cursor is hovering over it and when it isn't. You have to create a custom class for each complex attribute.

Cor:
```java
public class Cor implements Serializable {
    private Color textColor;
    private Color backgroundColor;

    public Cor() {
    }

    public Cor(Color textColor, Color backgroundColor) {
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

}
```

Cores:
```java
public class CorHover implements Serializable {
    
    private Color corHoverTexto;
    private Color corHoverFondo;

    public CorHover() {
    }

    public CorHover(Color corHoverTexto, Color corHoverFondo) {
        this.corHoverTexto = corHoverTexto;
        this.corHoverFondo = corHoverFondo;
    }

    public Color getCorHoverTexto() {
        return corHoverTexto;
    }

    public void setCorHoverTexto(Color corHoverTexto) {
        this.corHoverTexto = corHoverTexto;
    }

    public Color getCorHoverFondo() {
        return corHoverFondo;
    }

    public void setCorHoverFondo(Color corHoverFondo) {
        this.corHoverFondo = corHoverFondo;
    }
}
```