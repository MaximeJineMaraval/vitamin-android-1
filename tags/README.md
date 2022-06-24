# Tag component

## Tag design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you have the `VitaminTag` component or the `Material Chip` component.

```kotlin
implementation("com.decathlon.vitamin:tags:<version>")
```

```xml
<style name="Your.AppTheme" parent="Theme.Vitamin.DayNight">
    ...
</style>
```

```xml
<com.decathlon.android.tags.VitaminTagAccent
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:text="Tag" />
```

or :

```xml
<com.google.android.material.chip.Chip
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    style="@style/Widget.Vitamin.Tag.Accent"
    android:text="Tag" />
```

For adding an icon, you need to use this tag : `app:tagIcon` if you are using a `Vitamin Tag`, or a `app:chipIcon` if you are using a `Material Chip`.
```xml
<com.decathlon.android.tags.VitaminTagAccent
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:text="Tag"
     app:tagIcon="@drawable/ic_vtmn_football_line" />
```

or :

```xml
<com.google.android.material.chip.Chip
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    style="@style/Widget.Vitamin.Tag.Accent"
    app:chipIcon="@drawable/ic_vtmn_football_line"
    android:text="Tag" />
```



With the same usage as above, you have multiple tag types available: 

| Tag type                       | Kotlin Class                              | Attribute style                                   |
| ------------------------------ | ----------------------------------------- | ------------------------------------------------- |
| Accent                         | `VitaminTagAccent`                        | `?attr/vtmnTagAccentStyle`                        |
| Alert                          | `VitaminTagAlert`                         | `?attr/vtmnTagAlertStyle`                         |
| Brand                          | `VitaminTagBrand`                         | `?attr/vtmnTagBrandStyle`                         |
| Decorative Gravel              | `VitaminTagDecorativeGravel`              | `?attr/vtmnTagDecorativeGravelStyle`              |
| Decorative Brick               | `VitaminTagDecorativeBrick`               | `?attr/vtmnTagDecorativeBrickStyle`               |
| Decorative Saffron             | `VitaminTagDecorativeSaffron`             | `?attr/vtmnTagDecorativeSaffronStyle`             |
| Decorative Gold                | `VitaminTagDecorativeGold`                | `?attr/vtmnTagDecorativeGoldStyle`                |
| Decorative Jade                | `VitaminTagDecorativeJade`                | `?attr/vtmnTagDecorativeJadeStyle`                |
| Decorative Emerald             | `VitaminTagDecorativeEmerald`             | `?attr/vtmnTagDecorativeEmeraldStyle`             |
| Decorative Cobalt              | `VitaminTagDecorativeCobalt`              | `?attr/vtmnTagDecorativeCobaltStyle`              |
| Decorative Amethyst            | `VitaminTagDecorativeAmethyst`            | `?attr/vtmnTagDecorativeAmethystStyle`            |
| Accent Interactive             | `VitaminTagAccentInteractive`             | `?attr/vtmnTagAccentInteractiveStyle`             |
| Alert Interactive              | `VitaminTagAlertInteractive`              | `?attr/vtmnTagAlertInteractiveStyle`              |
| Brand Interactive              | `VitaminTagBrandInteractive`              | `?attr/vtmnTagBrandInteractiveStyle`              |
| Decorative Gravel Interactive  | `VitaminTagDecorativeGravelInteractive`   | `?attr/vtmnTagDecorativeGravelInteractiveStyle`   |
| Decorative Brick Interactive   | `VitaminTagDecorativeBrickInteractive`    | `?attr/vtmnTagDecorativeBrickInteractiveStyle`    |
| Decorative Saffron Interactive | `VitaminTagDecorativeSaffronInteractive`  | `?attr/vtmnTagDecorativeSaffronInteractiveStyle`  |
| Decorative Gold Interactive    | `VitaminTagDecorativeGoldInteractive`     | `?attr/vtmnTagDecorativeGoldInteractiveStyle`     |
| Decorative Jade Interactive    | `VitaminTagDecorativeJadeInteractive`     | `?attr/vtmnTagDecorativeJadeInteractiveStyle`     |
| Decorative Emerald Interactive | `VitaminTagDecorativeEmeraldInteractive`  | `?attr/vtmnTagDecorativeEmeraldInteractiveStyle`  |
| Decorative Cobalt Interactive  | `VitaminTagDecorativeCobaltInteractive`   | `?attr/vtmnTagDecorativeCobaltInteractiveStyle`   |
| Decorative Amethyst Interactive| `VitaminTagDecorativeAmethystInteractive` | `?attr/vtmnTagDecorativeAmethystInteractiveStyle` |

## Usage in standalone

If you don't want to inherit the full Vitamin theme on your entire app, you can use this component
in standalone, in applying the theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.DayNight">

    <com.decathlon.android.tags.VitaminTagAccent
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/Widget.Vitamin.Tag.Accent"
        android:text="Tag" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
