# Vitamin Theme

## Theme list

Vitamin provides 3 themes ready-to-use to customize your app :

| Theme                    | Description                                                                                                                                                                                                                               |
|--------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `Theme.Vitamin.Light`    | Ready to use Vitamin theme, with all the components, typographies and *light* colors. Perfect if you need a *light style* application / screens.                                                                                          |
| `Theme.Vitamin.Dark`     | Ready to use Vitamin theme, with all the components, typographies and *dark* colors. Perfect if you need a *dark style* application / screens.                                                                                            |
| `Theme.Vitamin.DayNight` | Ready to use Vitamin theme, with all the components, typographies and colors. This theme automatically switch from light to dark colors based on the *Android Night Mode*. Perfect if you need an application with *automatic night mode*.|

## How to use it?

### Style your app

To use Vitamin in your app, you just need to inherit from `Theme.Vitamin.xxx` in your current app theme.
All the Vitamin colors, fonts and components will be directly applied (except if you already override them).

```xml
<style name="AppTheme" parent="Theme.Vitamin.DayNight" />
```

```xml
<manifest
    ... >

    <application
        ...
        android:theme="@style/AppTheme">

        ...
        
    </application>

</manifest>
```

`Theme.Vitamin.xxx` are standard Android theme, so you can also use them to style only some parts of your app.

### Style your activities

```xml
<style name="ActivityTheme" parent="Theme.Vitamin.DayNight" />
```

```xml
<manifest
    ... >

    <application
        ... >

        <activity
            ...
            android:theme="@style/ActivityTheme"/>
        
    </application>

</manifest>
```

### Style subpart of you screens

```xml
<style name="SubpartTheme" parent="Theme.Vitamin.DayNight" />
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:theme="@style/SubpartTheme">
    
        ...

</androidx.constraintlayout.widget.ConstraintLayout>
```

## More examples?

For more precise documentation of every Vitamin component, you can read the README.md of their own modules.

You can also find some examples of usage in [the sample app](https://github.com/Decathlon/vitamin-android/tree/main/sample).
