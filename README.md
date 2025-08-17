
# 2048 JavaFX

A desktop clone of the classic [2048 game](https://github.com/gabrielecirulli/2048), built with Java and JavaFX.

## Features

- Smooth and modern UI using JavaFX
- Keyboard controls for gameplay
- Native font and icon resources
- Easy to build and run on any platform with Java 17+

## Getting Started

### Prerequisites

- Java 17 or newer
- Maven

### Running the Game

To launch the game, run:

```sh
mvn javafx:run
```

### Creating a Native Binary

To build a native binary using jlink:

```sh
mvn javafx:jlink
```

The output will be in the `target` directory.

## Resources

- Custom fonts and icons are included in the `src/main/resources` folder.

## Credits

- Inspired by [Gabriele Cirulli's 2048](https://github.com/gabrielecirulli/2048)

## License

This project is licensed under the [MIT License](./LICENSE)