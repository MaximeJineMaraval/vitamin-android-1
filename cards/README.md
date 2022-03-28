# Cards component

## Cards design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the different cards components components.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

## Generic exemple

```xml
<com.decathlon.vitamin.cards.Vitamin[*]CardView
    android:id="@+id/myCardView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:vtmnCardView_imageSrc="@drawable/my_image"
    app:vtmnCardView_title="My title"
    app:vtmnCardView_description="@string/my_description" />
```

Example with Glide : 

```kotlin
Glide.with(this)
    .load("https://bit.ly/3KviOlB")
    .into(object: CustomTarget<Drawable>() { 
        override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
            myCardView.imageView?.setImageDrawable(resource) 
        }

        override fun onLoadCleared(placeholder: Drawable?) {
            myCardView.imageView?.setImageDrawable(placeholder)
        }
    })
```

Example with custom layout :

```xml
<com.decathlon.vitamin.cards.Vitamin[*]CardView
    android:id="@+id/myCardView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:vtmnCardView_imageSrc="@drawable/my_image"
    app:vtmnCardView_customView="@layout/my_custom_layout" />
```

```kotlin
myCardView.customView.findViewById<Button>(R.id.my_button)
    .setOnClickListener {
        ...
    }
```

### Usage specs

As this component is a Vitamin custom one, you can find here the main available options to use it :

| Option                    | Attribute                      | Related class field                                                                                              | Default value |
|---------------------------|--------------------------------|------------------------------------------------------------------------------------------------------------------|---------------|
| Image source              | `app:vtmnCardView_imageSrc`    | You can use the `imageView` to set your image (does not exist for `VitaminWithoutImageCardView`                  | n/a           |
| Card title                | `app:vtmnCardView_title`       | `title`                                                                                                          | `null`        |
| Card description          | `app:vtmnCardView_description` | `description`                                                                                                    | `null`        |
| Custom Layout             | `app:vtmnCardView_customView`  | You can set the custom layout with `setCustomLayout(@LayoutRes resId: Int)` and retrieve it with `customLayout`  | n/a           |

### Customize the card
You can also customize the card style but keep in mind that **this is not recommended by Vitamin**

These elements can be customized for every card type :

| Element                     | Attribute                                    | Related class field         | Default value                   |
|-----------------------------|----------------------------------------------|-----------------------------|---------------------------------|
| Title text appearance       | `app:vtmnCardView_titleTextAppearance`       | `titleTextAppearance`       | `?attr/textAppearanceHeadline6` |
| Description text appearance | `app:vtmnCardView_descriptionTextAppearance` | `descriptionTextAppearance` | `?attr/textAppearanceBody3`     |

Here is the list of card style that can be overridden in the theme :

| Element              | Attribute                       | Default value                             |
|----------------------|---------------------------------|-------------------------------------------|
| Card Top Image style | `vtmnTopImageCardViewStyle`     | `@style/Widget.Vitamin.Card.TopImage`     |
| Without Image style  | `vtmnWithoutImageCardViewStyle` | `@style/Widget.Vitamin.Card.WithoutImage` |



## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin cards styles.
You can now use the card component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:cards:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <item name="vtmnTopImageCardViewStyle">@style/Widget.Vitamin.Card.TopImage</item>
        <item name="vtmnWithoutImageCardViewStyle">@style/Widget.Vitamin.Card.WithoutImage</item>
    </style>
</resources>
```

### Version 2

If you don't want to use Vitamin colors and font on all your app, you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
 <androidx.appcompat.widget.LinearLayoutCompat
    android:id="@+id/container"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin"
    android:orientation="vertical">

    <com.decathlon.vitamin.cards.Vitamin[*]CardView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:vtmnCardView_imageSrc="@drawable/my_image"
        app:vtmnCardView_title="My title"
        app:vtmnCardView_description="@string/my_description" />

</androidx.appcompat.widget.LinearLayoutCompat>
```