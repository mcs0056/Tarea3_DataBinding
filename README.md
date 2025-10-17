# Tarea3_DataBinding
Actividad práctica donde cada grupo desarrollará una aplicación Android sencilla pero completamente funcional y luego la misma pero con binding. La misión será crear un conversor, calculadora o herramienta útil que aplique los conceptos fundamentales de Data Binding y configuración multilenguaje.

# Conversor de Números Romanos

## Descripción del proyecto
Aplicación Android desarrollada como parte de la actividad **"Crea tu propio conversor temático con Data Binding"**.  
Permite convertir números decimales (1–3999) a su equivalente en números romanos mediante una interfaz sencilla, clara y funcional.  

El proyecto está implementado en **Java** utilizando **Android Studio**, aplicando los conceptos de:
- **Data Binding** (vinculación directa entre la interfaz y la lógica)
- **Internacionalización (i18n)** con soporte para **español e inglés**
- **Diseño responsivo** mediante componentes XML nativos

---

## Equipo de desarrollo
- **Integrantes:**
  - [Miguel Ceballos Sánchez]
  - [Félix Caballero Peña]
  - [Alberto Alcalde Montero]
  
---

## Objetivos de aprendizaje
- Implementar correctamente el sistema de **Data Binding** en Android.
- Aplicar el concepto de **internacionalización** (`strings.xml` y `strings-en.xml`).
- Crear una **interfaz clara y funcional** en XML.
- Desarrollar una **lógica de conversión** simple y eficiente.

---

## Funcionamiento de la aplicación

1. El usuario introduce un número decimal entre **1 y 3999**.  
2. Al pulsar el botón **“Calcular”**, la aplicación convierte el número a **romano**.  
3. Si el número no es válido, se muestra un mensaje de error.  
4. Los textos y mensajes se adaptan automáticamente al idioma del sistema (español o inglés).

---

## Ejemplo de uso
| Entrada | Salida esperada |
|----------|----------------|
| `5`      | `V`            |
| `19`     | `XIX`          |
| `2024`   | `MMXXIV`       |
| `3999`   | `MMMCMXCIX`    |

---

## Tecnologías utilizadas
- **Lenguaje:** Java  
- **Entorno:** Android Studio  
- **Arquitectura:** MVVM con Data Binding  
- **Compatibilidad:** Android 7.0 (API 24) o superior  

---

## Internacionalización
| Idioma | Archivo | Descripción |
|---------|----------|-------------|
| Español | `/res/values/strings.xml` | Textos principales en español |
| Inglés | `/res/values-en/strings.xml` | Traducción completa al inglés |

---

## Estructura del proyecto
app/
└── java/com/sinBinding/numerosromanos/
├── MainActivity.java
├── Conversor.java
└── res/layout/
└── activity_main.xml
└── res/values/
└── strings.xml
└── res/values-en/
└── strings.xml


app/
└── java/com/conBinding/numerosromanos/
├── MainViewModel.java
├── MainActivity.java
├── Conversor.java
└── res/layout/
└── activity_main.xml
└── res/values/
└── strings.xml
└── res/values-en/
└── strings.xml

---

## Capturas de pantalla
> - Pantalla principal  
> - Ejemplo de conversión  
> - Versión en inglés  

---

## Ejecución
1. Clona el repositorio desde GitHub:  
   ```bash
   git clone https://github.com/usuario/conversor-romanos.git
Ábrelo en Android Studio.

Ejecuta el proyecto en un emulador o dispositivo físico.
