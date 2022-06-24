# Button component

## Button design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `Button` component or the `Vitamin*Button` component.

```kotlin
implementation("com.decathlon.vitamin:buttons:<version>")
```

```xml
<style name="Your.AppTheme" parent="Theme.Vitamin.DayNight">
    ...
</style>
```

```xml
<com.decathlon.vitamin.buttons.VitaminPrimaryMediumButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

or

```xml
<com.google.android.material.button.MaterialButton
    style="?attr/vtmnButtonPrimaryMediumStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

With the same usage as above, you have multiple button types available: 

| Button type             | Kotlin Class                         | Attribute style                              |
|-------------------------|--------------------------------------|----------------------------------------------|
| Primary Medium          | `VitaminPrimaryMediumButton`         | `?attr/vtmnButtonPrimaryMediumStyle`         |
| Primary Large           | `VitaminPrimaryLargeButton`          | `?attr/vtmnButtonPrimaryLargeStyle`          |
| Secondary Medium        | `VitaminSecondaryMediumButton`       | `?attr/vtmnButtonSecondaryMediumStyle`       |
| Secondary Large         | `VitaminSecondaryLargeButton`        | `?attr/vtmnButtonSecondaryLargeStyle`        |
| Tertiary Medium         | `VitaminTertiaryMediumButton`        | `?attr/vtmnButtonTertiaryMediumStyle`        |
| Tertiary Large          | `VitaminTertiaryLargeButton`         | `?attr/vtmnButtonTertiaryLargeStyle`         |
| Conversion Medium       | `VitaminConversionMediumButton`      | `?attr/vtmnButtonConversionMediumStyle`      |
| Conversion Large        | `VitaminConversionLargeButton`       | `?attr/vtmnButtonConversionLargeStyle`       |
| Primary Reversed Medium | `VitaminPrimaryReversedMediumButton` | `?attr/vtmnButtonPrimaryReversedMediumStyle` |
| Primary Reversed Large  | `VitaminPrimaryReversedLargeButton`  | `?attr/vtmnButtonPrimaryReversedLargeStyle`  |
| Ghost Medium            | `VitaminGhostMediumButton`           | `?attr/vtmnButtonGhostMediumStyle`           |
| Ghost Large             | `VitaminGhostLargeButton`            | `?attr/vtmnButtonGhostLargeStyle`            |
| Ghost Reversed Medium   | `VitaminGhostReversedMediumButton`   | `?attr/vtmnButtonGhostReversedMediumStyle`   |
| Ghost Reversed Large    | `VitaminGhostReversedLargeButton`    | `?attr/vtmnButtonGhostReversedLargeStyle`    |

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

    <com.decathlon.vitamin.buttons.VitaminPrimaryMediumButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="My Button" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
