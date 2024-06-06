## Proceso para Contribuir  🚀
### Fork el repositorio: 
Haz un "fork" del proyecto a tu cuenta de GitHub para tener tu propia copia. Para hacer esto, haz clic en el botón "Fork" en la parte superior derecha de la página del repositorio en GitHub. Esto creará una copia del repositorio en tu cuenta de GitHub.

### Clona tu fork:  
Después de hacer un fork, clona el repositorio a tu máquina local. Para hacerlo, copia la URL de tu fork haciendo clic en el botón verde "Code" y luego ejecuta 
```sh
git clone <URL del fork> en tu terminal.
```

### Añade el repositorio original como remoto:  
Para mantener tu fork actualizado con los cambios del repositorio original, agrega el repositorio original como un remoto. Puedes hacerlo ejecutando `git remote add upstream <URL del repositorio original>`.

### Navegar en la carpeta creada 
#### Árbol de carpetas 

![image](https://github.com/Jloen1999/retosITCodeEG/assets/74373827/7256a6b1-56da-4ec3-9a20-7c1272ef7088)



- Entra en la carpeta local reto-01/soluciones/ del directorio clonado.
```sh
cd tu-repositorio-forkeado/reto-01/soluciones/
```

### Añadir su solución:

- Crea tu programa dentro de la carpeta soluciones.
- Dicho programa debe tener el mismo nombre que el que tienes en telegram

### Crear una nueva rama para su solución:
```sh
git checkout -b solucion-reto-01-tu-usuarioTelegram
```

- Hacer commit de los cambios:

```sh
git add .
git commit -m "Añadir solución para el reto 01 por [nombre]"
```

### Push de la nueva rama al repositorio:

```sh
git push origin solucion-reto-01-nombre
```

### Crear un Pull Request (PR):
- Ve a la página del repositorio en GitHub.
- Haz clic en "Compare & pull request".
- Añade una descripción detallada de la solución y envía el PR.
### Sincroniza el fork:  
Puedes hacerlo desde github.com/tu-usuario/tu-repositorio-de-los-retos-programación y haciendo click en Sync fork. También puedes hacerlo desde la terminal `gh repo sync -b main` o `git switch main` && `git fetch upstream` && `git merge upstream/main`. Más información en la documentación oficial de Github
