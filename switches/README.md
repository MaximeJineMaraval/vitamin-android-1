# Switch component

## Switch design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `SwitchMaterial` component or the `VitaminSwitch` component. 

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="Your.AppTheme" parent="Theme.Vitamin.DayNight">
    ...
</style>
```

```xml
<com.decathlon.vitamin.switches.VitaminSwitch
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My switch component" />
```

or 

```xml
<com.google.android.material.switchmaterial.SwitchMaterial
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My switch component" />
```

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

    <com.decathlon.vitamin.switches.VitaminSwitch
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:checked="true"
        android:text="My switch component" />

</androidx.constraintlayout.widget.ConstraintLayout>
```