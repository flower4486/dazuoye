## Changelog

### 2.8.0

*2019-04-25*

#### New features

- Divider
  - Add divider component (#15055 by @island205)
- Rate
  - Add custom colors and icon-classes by passing a object (#15051 by @SimonaliaChen)
- Link
  - Add link component (#15052 by @iamkun)
- Calendar
  - Add calendar component (#14908 by @ziyoung)
- Icon
  - Add icon (#15214 by @iamkun)
- Alert
  - Add dark theme (#15041 by @island205)
- Image
  - Add image component (#15117 by @SimonaliaChen)
- Collapse
  - CollapseItem can be disabled (#15076 by @ziyoung)
- Carousel
  - Add direction attribute and support vertical direction (#15122 by @ziyoung)
- Pagination
  - Add hide-on-single-page attribute (#15096 by @ziyoung)
- Slider
  - Add marks attribute (#15133 by @luckyCao)
- Input
  - Add show-word-count attribute (#15075 by @luckyCao)
- InputNumber
  - Add step-strictly attribute (#15050 by @luckyCao)
- Tooltip, Dropdown, Popover
  - Support tabindex attribute (#15167 by @ziyoung)

#### Bug fixes

- Notification
  - Fix title word break (#15008 by @iamkun)
- Form
  - Fix switching the rules in el-form not work (#14985 by @luckyCao)
  - Fix label style (#14969 by @ziyoung)
  - Required FormItem displays asterisk when label is auto (#15144 by @ziyoung)
- Pagination
  -  Fix slot not updated (#14711 by @lucyhao)
- Table
  - Fix load bug in lazy mode (#15101 by @ziyoung)
  - Fix cell width when colspan is grater than 1 (#15196 by @ziyoung)
  - Improve performance (#14868 by @ziyoung)
  - Don't emit triggers sort-change during initialization (#14625 by @PeanutWatson)
  - Equal behaviour for height and max-height (#14660 by @arthurdenner)
- Dialog
  - Fix dialog body correctly break long words (#15027 by @iamkun)
- Alert
  - update type definition (#15186 by @ziyoung)
- Tabs
  - Fix issue where Promise rejection was hitting application (#14816 by @ffxsam)
  - Rerender when slot changes (#15238 by @ziyoung)
- Message
  - Fix type definition (#14968 by @agoni1212)
- Select
  - Fix error when value is undefined or null (#15022 by @luckyCao)
- Tree
  - Delete current node after it removed (#14604 by @sinchang)
  - Improve performance (#14881 by @ChenZhuoSteve)
- Dropdown
  - Fix style (#14907 by @doing123)
- Slider
  - Fix broken keyboard a11y bug (#14792 by @erezsob)
- Menu
  - ActiveIndex value shall be null if defaultIndex does not exist(#14074 by @hoythan)
- Directive
  - RepeatClick: use Date.now() instead of new Date() (#14776 by @pavelmash)
- Upload
  - Fix Upload transparent picture display style (#15039 by @iamkun)
- Theme
  - Add zero border (#15256 by @iamkun)

#### Optimization

- Chore
  - Update changelog zh-cn (#14965 by @iamkun)
  - Hide demo description when it's empty (#15014 by @ziyoung)
  - Display dev server info by default by @iamkun)
  - Fix 2.6.0 changelog error (#15026 by @iamkun)
  - Update build config (#14821 by @abc3660170)
  - Add hmr (#15221 by @SimonaliaChen)
  - Use sourcemap in dev environment (#15087 by @ibufu)
Docs
  - Rename variable in docs (#14602 #15003 #15094 #15105 by @liupl)
  - Fix upload doc error (#15023 by @iamkun)
  - Update Form custom validator doc (#15040 by @iamkun)
  - Update Tabs docs to display vertical tabs (#15053 by @iamkun)
  - Use eleme.cn as domain (#15139 by @ziyoung)
  - Fix Image route name (#15194 by @iamkun)
  - Remove duplicated fr translation (#15207 by @iamkun)

#### Breaking changes

- Rate
  - Fix decimal display support in disabled mode (#15089 by @haoranyu)
- Select
  - Use placeholder option label to set placeholder in filter mode (#14989 by @ibufu)

### 2.7.2

*2019-04-03*

#### Bug fixes

- Form
  - Fix auto `label-width` style (#14955 by @ziyoung)
  
#### Optimization
- Docs
  - Fix doc img link error (#14957 by @iamkun)
- Chore
  - Fix deploy mkdir error (#14952 by @iamkun)

### 2.7.1

*2019-04-03*

#### Bug fixes

- Select
  - Set value to null when cleared (#14322 by @aaronfulkerson)
- Input
  - Update DOM dependent values on type change (#14889 by @wacky6)
- Table
  - Make `defaultExpandAll` works when expanded column exists (#14935 by @ziyoung)
- Dialog
  - Background color can be configured (#14939 by @ziyoung)
- Form
  - `label-width` supports auto width (#14944 by @ziyoung)
  
#### Optimization
- Docs
  - Update Spanish docs (#14913 by @Gonzalo2310)
  - Add French doc for new component (#14924 by @ziyoung)
  - Optimize Tabs docs (#14938 by @ziyoung)

### 2.7.0

*2019-03-28*

#### New features

- Table
  - Agregado soporte de datos con estructura tree (#14632 by @ziyoung)

#### Bug fixes

- Tabs
  - Uso de color primario como boxShadow color (#14558 by @Richard-Choooou)
  - Renderizaci??n cuando cambia la etiqueta (#14496 by @akki-jat)
- Table
  - El pie de p??gina sigue la alineaci??n de las celdas del body (#14730 by @ziyoung)
- NavMenu
  - Se ha corregido que al hacer click en el el-submenu se disparaba childMenu nuevamente (#14443 by @PanJiaChen)
- Dropdown
  - Compatible con la nueva sintaxis de v-slot en V 2.6 (#14832 by @ziyoung)
- ColorPicker
  - Corregido el  manejo de error de string en hex color (#14793 by @iamkun)
- Tree
  - Revertido pr #13349 (#14847 by @ziyoung)
- Tooltip
  - Muestra cuando el valor inicial es verdadero (#14826 by @ziyoung)
- Docs
  - Actualizaci??n de documentos de cascader (#14442 by @panhezeng)
- Style
  - Correcci??n de la media query en sm-only, md-only, lg-only (#14611 by @sinchang)

#### Optimization

- Chore
  - A??adido descripci??n de la p??gina web (#14802 by @iamkun)

### 2.6.3

*2019-03-21*

#### Bug fixes

- Correcci??n del estilo de demostraci??n de Cascader (#14789 by @ziyoung)
- Eliminaci??n de la operaci??n DOM innecesaria (#14788 by @ziyoung)
- Correcci??n del valor predeterminado del DST de DatePicker (#14562 by @wacky6)

### 2.6.2

*2019-03-21*

#### New features

- DatePicker
  - A??adido monthrange para el atributo type (#14487 by @zxyRealm)
- i18n
  - A??adido Locale Croata (#14360 by @danijelh)
- Docs
  - Actualizaci??n del documento en franc??s para 2.6.1 y correcci??n de errores tipogr??ficos (#14555 by @smalesys)
  - Actualizaci??n de la traducci??n al franc??s (#14643 by @smalesys)

#### Bug fixes

- Input
  - Corregida regresi??n (#14572 by @wacky6)
- DatePicker
  - Correcci??n del c??lculo del primer d??a de la semana (#14523 by @sinchang)
  - Corregido el formato de valor del selector de semana (#13754 by @wacky6)
- Steps
  - Corregida issue #14502 (#14596 by @sinchang)
  - Arreglado estilo con tema simple (#14610 by @sinchang)
- Docs
  - Renombrada variable en documentos de Table (#14587 by @likwotsing)
  - A??adido ??ndice de b??squeda en franc??s (#14565 by @iamkun)
  - Correcci??n del estilo de p??gina TimePicker (#14579 by @ziyoung)
  - Renombrada variable en Upload docs (#14593 by @liupl)
  - Actualizaci??n de los documentos del Form async validator (#14694 by @iamkun)
  - Solucionado el error de tooltip doc (#14748 by @iamkun)
  - Corregido error tipogr??fico (#14751 by @2bj)
  - Corregido los elementos de control de resaltado para Webkit touch (#14703 by @VladG0r)


#### Optimization

- Chore
  - Actualizaci??n del script de construcci??n de ci (#14600 by @ziyoung)
  - Actualizaci??n ga tracking (#14560 por @iamkun)
  - A??adido m??s evento ga (#14633 by @iamkun)
  - Actualizaci??n del grupo de discusi??n (#14741 por @iamkun)
  - Actualizaci??n de los deps y conf de las pruebas (#14735 by @wacky6)
  - Actualizaci??n gulp (#14745 by @ziyoung)
  - Uso de codepen para mostrar la demo y corregir el error doc (#14747 por @ziyoung)

### 2.6.1

*2019-03-03*

#### Bug fixes

- **Don't specify node version** (by @iamkun in #14546)
- Correcci??n del directorio doc en `deloy-faas.sh` (by @ziyoung in #14553)
- Arreglado el estilo de date en changelog para 2.6.0 (by @island205 in #14547)
- Corregido error tipogr??fico en doc (by @wack6 in #14552)

### 2.6.0

*2019-03-01*

#### New features
- Timeline
  - Agregado componente timeline (by @jikkai in #14248)
- DropdownItem
  - A??adida la prop icon  a `el-dropdown-item` (by @gabrielboliveira in #14088)
- Input
  - A??adida la prop show-password (by @phshy0607 in #13966)
- Select
  - A??adido el slot `empty` (by @elfman in #13785)
- Autocomplete
  - A??adida la prop highlight-first-item (by @YamenSharaf in #14269)
- I18n
  - Locale Armenio creado (by @hamletbarsamyan in #14214)
- Docs
  - Traducci??n al franc??s (by @smalesys in #12153, #14418, #14434)

#### Optimization
- Alert
  - Actualizada la descripci??n de Alert  (by @iamkun in #14488)
- Input
  - Actualizado input password (by @iamkun in #14480)
- InputNumber
  - Removido parseFloat innecesario (by @JuniorTour in #14172)
- Menu
  - A??adido soporte para `el-menu-item` sin ??ndice (by @georgyfarniev in #13298)
- Table
  - Eliminadas algunas operaciones DOM html (by @elfman in #13643)
- Upload
  - Optimizado el c??digo (by @elfman in #13973)
- Popup
  - Optimizado el c??digo (by @KAionro in #14413)
- Docs
  - Se han agregado m??s detalles sobre c??mo ejecutar el modo de play para contribuir (by @island205 in #14355)
  - Warn input como componente de control. (by @wacky6 in #14463)
  - Actualizacion de la documentacion de Table (by @luguokong in #14329)
  - Actualizacion de la documentacion de input (by @iamkun in #14437)
  - Actualizacion de la documentacion de custom-theme (by @wangguohao in #14297)
  - Se ha hecho que el icono cambie de estilo en hover (by @tuxinghuan in #14295)
- Build
  - Minimizaci??n de css y js para la doc del sitio de Element (by @iamkun in #14430)
  - Aceleraci??n de webpack (by @hetech in #14484)
  - Uso de cli para seleccionar la versi??n de lanzamiento (by @hetech in #14354)
- Instalaci??n de stale para el manejo de issues (by @island205 in #14392)

#### Bug fixes
- Menu
  - Corregido el error de focus del submen?? cuando se cambiaba la pesta??a del navegador (by @liupl in #13976)
- MessageBox
  - Corregida la definicion de type (by @NateScarlet in #14278)
- ScrollBar
  - Prevenido el clic del bot??n derecho en la miniatura (by @xifeiwu in #14196)
- Switch
  - Activaci??n de la validaci??n de formularios si el valor cambia  (by @hetech in #14426)
- Table
  - Se ha convertido el m??todo toggleAllSelection en un m??todo de instancia (by @letanure in #14075)
- Tabs & Dropdown
  - Estilo arreglado (by @hetech in #14452)
- Tree
  - Los tips de texto vac??o son diferentes de las tablas (by @ColinCll in #14331)
- Docs
  - Corregido el error de formato de la documentacion de DatetimePicker (by @iamkun in #14290)
  - Problema de ortograf??a en la documentaci??n de datepicker (by @helmut in #14481)
  - Arreglado estilo doc de paginaci??n (by @liuchuzhang in #14451)

#### Breaking changes
- Table
  - Cambiar el orden de los par??metros enviados en los eventos de las filas (by @jikkai in #12086)

### 2.5.4

*2019-02-01*

#### Bug fixes

- Build: Se ha solucionado el problema de configuraci??n de babel que provocaba que el efecto de transicion de collpase se rompiera (por @island205 en #14282)

### 2.5.3

*2019-01-31*

#### Optimization

- Optimizaci??n del c??digo de Message (por @vok123 en #14029)
- Retirada de gh-pages (por @ziyoung en #14266)
- A??adido enlace IssueHunt (por @island205 en #14261)

#### Bug fixes

- Corregido el error del m??dulo UMD en el lado del servidor (por @island205 en #14242)
- Corregido el estilo activo de TabBar (por @iamkun en #14240)
- Corregido el error de c??digo de demo de la tabla (por @xunmeng en #14253)

#### Bug fixes


### 2.5.2

*2019-01-27*

#### Optimization
- Docs:
  - Actualizacion ChangeLog ES 2.5.1 (by @Gonzalo2310 in #14231)

#### Bug fixes
- Build:
  - Eliminar comentarios no borrados en el m??dulo umd `lib/index.js` (por @island205 en #14233)
  - Corregido el error de exportaci??n disparado en el m??dulo commonjs usado en nuxt.js (por @island205 en #14232)
  - Correcci??n de problemas de compilaci??n de 2.5.1 (por @iamkun en #14228)

### 2.5.1

*2019-01-26*

#### Optimization
- DatePicker: resalta el mes y a??o actual (por @Debiancc en #14211)
- Actualizacion del changelog 2.5.0 (por @wacky6 en #14217)

#### Bug fixes
- Arreglado el problema de exportaci??n generado por la actualizaci??n de webpack (por @island205 en #14220)
- Guardados los documentos 2.4.11 y la nueva subcarpeta para 2.5+ (por @iamkun en #14222)

### 2.5.0

*2019-01-25*

#### Bug fixes
- Autocompletar
  - Corregida la ??ltima l??nea del men?? desplegable que comenzaba recortada (#13597) (por @ziyoung)
  - Arreglada la popper arrow que faltaba (#13762) (por @liuchuzhang)
- Carrusel
  - Contador de limpieza cuando el componente es destruido (#13820) (por @elfman)
- Cascader
  - Retirada de los props computados obsoletos (#13737) (por @iamkun)
  - Se corrigi?? la definici??n de tipo de las opci??nes de Cascader en TypeScript (#13613) (por @NateScarlet)
  - Corregido icono que cubre el texto (#13596) (por @ziyoung)
- Checkbox
  - Refinado el estilo (por @PanJiaChen)
- DatePicker
  - A??ade el `key` en v-for de TimeSpinner (#13547) (por @Ende93)
  - Corregido el resaltado de la semana en el l??mite del a??o (#13883) (por @suyi91)
- Input
  - Corregida la referencia del nodo DOM del textarea (#13803) (por @laomu1988 @island205)
- Pagination
  - El valor de entrada no ser?? menor que 1 (#13727) (por @elfman)
- Popover
  - Correcci??n de problemas de popover con el disparador de hover (#13104) (por @goldengecko)
  - Corregido el fallo de memoria de instancia de popper (#13988) (por @qpxtWhite)
- Radio
  - Refinado el estilo (por @ohhoney1)
- Table
  - Mejorada la ordenaci??n de tablas al hacer clic en la flecha de ordenaci??n (#12890) (por @ohhoney1)
  - Solucionado el problema de alineaci??n vertical de texto vac??o en IE10+ (#13638) (por @imzjjy)
  - Corregida la documentaci??n del tipo de ??ndice  (#13628) (por @ilovefafa)
  - Correcci??n del problema de visualizaci??n de `show-summary` cuando el encabezado multinivel tiene el attr fixed (#13914) (por @luckyCao)
- Tabs
  - Corregido error de autodesplazamiento (#13696) (por @iamkun)
  - Obtener la tab correcta a trav??s del nombre de tab (#13705) (por @iamkun)
  - Uso de paneName en lugar de name para determinar el estilo del panel (#13733) (por @iamkun)
- Tree
  - Corregido que `showCheckbox` prop en `Tree` no puede afectar a los hijos `tree-node` (por @KidneyFlower)
  - Actualizado documento y archivo de definici??n (#13540) (por @ziyoung)
- Upload
  - Agregada la prop `url` para subir el archivo cuando `list-type` cambia (#13771) (por @elfman)
- Slider
  - Correcci??n de la sangr??a del c??digo fuente (#13955) (por @wacky6)
- I18n
  - A??adidas las traducciones de catal??n que faltaban (por @jaumesala)
  - A??adidas las traducci??nes de ruso que faltaban (#13658) (por @justlp)
  - Correcci??n de las traducciones al fin??s (#14137) (por @jenkrisu)
- Doc
  - Actualizaci??n del documento 2.4.11 (#13522) (por @Gonzalo2310)
- Otros
  - Eliminar  scripts innecesarios (por @ziyoung)
  - Corregido el error de anchor link (#13753) (por @iamkun)
  - Correcci??n de la capitalizaci??n inconsistente en la documentaci??n (por @wonderjar)
  - A??adido c??digo qr del grupo de chat DingDing al readme (by @iamkun in #13957)
  - A??adido logs de hilo a .gitignore (#13922) (por @mimimi)
  - Eliminada la cuota de patrocinadores (#14156) (por @island205)
  - Actualizado readme qr code src (#13960) (por @iamkun)
  - Actualizado enlace CDN, corregido error tipogr??fico (por @ziyoung)

### 2.4.11

*2018-11-21*

- Revertido pr #13296. Arreglado que al hacer clic fuera del Men?? causaba que el Submen?? colapsara, #13478
- Ajustados los media query breakpoints de las pantallas peque??as (xs), #13468 (por @alekoshen712)

### 2.4.10

*2018-11-16*

- Se corrigio que se necesitaban varios clics en Select para mostrar la lista desplegable, #13268
- El icono de limpiado para el input no se muestraba cuando Form estaba deshabilitado, #13208
- Ajustados los estilos de Select, Progress, Autocomplete, Tooltip, Collaspe, TimePicker, #13188 (by @porcelainHeart) #13210 #13266 #13257 #13290 #13347 (by @PanJiaChen)
- Se agreg?? el atributo `loop` al componente carrusel, #13217
- Cuando los datos de Table cambian, la l??nea resaltada permanecer??, #13200
- Table header scoped slot puede recibir par??metros, #13263
- El m??todo `clearFilter` de la tabla soporta argumentos, #13176
- El tooltip ya no se crea cuando no hay contenido en la celda de Table, #13152 (por @rongxingsun)
- El contenido del input del panel ColorPicker se muestra correctamente, #13278
- ColorPicker ya no activa la validaci??n de formularios al arrastrar, #13299
- InputNumber se le ha a??adido el m??todo `select`, #13286 (por @st-sloth)
- Autocompletar agreg?? el evento `clear`, #12171(by arthurdenner) #13326
- Puede cerrar Men?? haciendo clic fuera del Men??, #13296
- El m??todo `validateField` de Form puede recibir argumentos, #13319
- Cascader a??adi?? el evento `visible-change`, #13415
- DatePicker agreg?? slot para separador de rango, #13272 (por @milworm)
- Tree a??ade las propiedades `iconClass` y `currentNodeKey`, #13337 #13197 (por @isnifer)
- Progress permite texto en el atributo `status` #13198 (por @ali-master)
- Corregidas las `defaultCheckedKeys` de Tree que causaba un error, #13349 (por @dive2Pro)


### 2.4.9

*2018-10-26*

- El par??metro de Form's `clearValidate` soporta cadenas, #12990 (by @codinglobster)
- Se agreg?? el atributo `type` para Badge, #12991
- Ser puede usar scoped-slot para personalizar el encabezado de la columna de Table #13012 (por @ivanseidel)
- Arreglado que el input box de Select no se podia escrbir en IE, #13034 (by @GaliMU)
- La opci??n Seleccionar no se cerraba cuando el espacio era insuficiente, #12329 (by @akki-jat)
- Cuando se expande la lista desplegable de Seleccionar, el icono de flecha tambi??n se mostrar?? correctamente, #12353 (by @firesh)
- Arreglado que el atributo size de Select no funcionaba, #13070
- Select multiple values pueden ser limpiado en lote, #13049 (by @ZSkycat)
- Arreglado el ??ltimo TabNav que no se pod??a borrar, #13039
- Arreglado que la etiqueta del TabNav no se mostraba correctamente, #13178
- A??adido title slot para Alert, #13082 (by @Kingwl)
- Corregido un problema por el cual el contenido del tooltip en Table era incorrecto, #13159 (by @elfman)
- Optimizada la animaci??n de Upload cuando el archivo es eliminado, #12987
- Ajustado el estilo de InputNumber cuando no se muestra el bot??n de control, #13052

### 2.4.8

- No se muestra el contorno cuando Switch est?? enfocado, #12771
- Arreglado el estilo del Dropdown en ButtonGroup, #12819 (por @bluejfox)
- A??adido evento opened para Dialog, #12828
- Corregido el orden incorrecto de visualizaci??n de TabNav, #12846
- Corregido el problema de que Tabs no se desplazaba a la pesta??a seleccionada, #12948
- Corregido el problema de que el identificador no se mostraba cuando se arrastraba el Tree node, #12854
- El par??metro validar evento de Form contiene el mensaje de validaci??n, #12860 (por @YamenSharaf)
- Se ha corregido el DatePicker que no verificaba la validez de la hora de entrada del usuario, #12898
- Arreglado el problema de que el atributo `render-header` del encabezado de Table no funcionaba, #12914

### 2.4.7

*2018-09-14*

- Corregido que DatePicker no activaba la validaci??n del Form, #12328 #12348
- Corregidos el lanzamiento de errores del DatePicker en modo m??ltiple, #12347
- Corregida la posici??n incorrecta del spinner del DatePicker, #12415 (por @rang-ali)
- Se ha corregido el llenado autom??tico del input del DatePicker, #12521 (por @abdallanayer)
- Corregida el input no resaltada en Cascader, #12341
- Corregido el orden incorrecto de Tabpane, #12346
- Corregida la posici??n incorrecta del cursor de ColorPicker, #12376 (por @cnwhy)
- Corregido el estilo del Submen??, #2457
- Corregido el resaltado despu??s de seleccionar el Submen??, #12479
- Corregidos los valores incorrectos seleccionados por Cascader, #12508 (por @huangjinqiang)
- Corregido el valor incorrecto del input de Paginaci??n, #12525
- Se ha corregido el orden en que la paginaci??n desencadena los eventos, #12530
- Corregido que no se mostraba el Table Filter, #12539
- Corregido Tree que era incapaz de borrar nodos, #12684
- Corregida la altura de los Select Input que cambiaba en modo simple, #12719
- Arreglado el estilo de la etiqueta FormItem en Form anidado, #12748
- A??adido el atributo `autocomplete` para Input, obsoleto `auto-complete`, #12514 (por @axetroy)
- A??adido el slots-scope de Form para mostrar la informaci??n de validaci??n, #12715 (por @YamenSharaf)

### 2.4.6

*2018-08-09*

- Arreglada la tabla que no mostraba el ??cono del filtro cuando a  `filter` se les asignaba un array vac??o, #12165
- Arreglado Menu que no guardaba el estado activo cuando cambiaba `collapse` #12178 (por @elfman)
- Se ha corregido que Cascader no escapaba a los caracteres especiales para Regexp, #12248
- Se ha corregido que el RadioBot??n deshabilitado mostraba la sombra de la caja cuando se hac??a clic, #12262
- Arreglado el efecto de la tecla de flecha en Select cuando el valor por defecto es `undefined`,#12322
- Corregida la funci??n de consulta de Select not debounced en modo multi, #12181
- Corregida que la palabra clave de consulta de Select desaparec??a en modo multi, #12304
- Corregido el ancho incorrecto de Dialog cuando se muestra a pantalla completa, #12203
- Corregida la visualizaci??n incorrecta de Main en IE, #12237
- Corregido el trigger de Input con dos validaciones de Form, #12260
- Arreglado el a??adir un nuevo nodo de ??rbol que causaba que los nodos desaparecieran, #12256
- Arreglado el nodo Tree no se borraba despu??s de arrastrar, #12279
- Popover corregido porque no era visible cuando InputNumber no enfocaba, #12284
- A??adido el atributo `popper-append-to-body` para Autocompletar, #12241
- A??adido el modificador `sync` para el atributo `page-size` de Pagination, #12281

### 2.4.5

*2018-07-26*

- Se ha corregido en Table que `class-name` no funcionaba para las columnas `expand`, #12006
- Se ha a??adido el m??todo `toggleAllSelection` para Table, #12047
- Corregida la posici??n incorrecta del `suffix slot` cuando Input contiene Select, #12108
- Corregido que el `line-height` de Option no se establecia, #12120
- Corregido que TimeSelect con valor por defecto `null` no podia ser asignado despu??s de ejecutar `resetField`, #12010
- Arreglado el evento `keydown` que cuando no era una tecla de flecha no funciona en Tree, #12008
- Corregido nodo padre checked en modo lazy, #12106
- A??adido el par??metro `includeHalfChecked` para getCheckedNodes de Tree, #12014

### 2.4.4

*2018-07-13*

- Corregido que se disparaba la validacion del Select despu??s de reajustar el formulario, #11837
- Corregida la posici??n incorrecta del slot Input `suffix`  cuando se usaba el slot `suffix` con el slot  `append`  , #11951
- Corregido el clearable Input que muestraba el icono de borrado cuando era readonly, #11967
- Arreglado el nodo Tree checked cuando estaba disabled, #11847
- Corregido que  `default-checked-keys`  no funcionaba en Tree, #11971
- Corregido que el `empty-text` no era visible cuando el nodo Tree se filtraba, #11971
- Arreglada la posici??n de texto vac??o sobredimensionado en Table, #11965
- Corregido que la fila de la tabla no se modificado el resaltado cuando `current-row-key` era asignada a null, #11866
- Arreglado que mostraba el filtro del dropdown cuando los filtros eran un array vac??o, #11864
- Corregido que el cambio de label de Radio no detenia propagacion de eventos, #11912

### 2.4.3

*2018-07-03*

- Corregido `allow-drop` que no funcionaba correctamente cuando los nodos de ??rbol tenian una altura personalizada, #11797
- Ahora puede pasar un par??metro al m??todo `clearValidate` de Form, especificando qu?? resultados de validaci??n de `FormItems` necesita borrar, #11821
- A??adido el atributo `distinguishCancelAndClose` para MessageBox, #11831

### 2.4.2

*2018-06-26*

- Ahora el `class-name` y el `label-class-name` de la tabla son reactivos, #11626
- Arreglado que Table seguia resaltando la fila en la que se hab??a hecho clic cuando  `highlight-current-row` era `false`, #11646
- Corregido un error de estilo de ButtonGroup cuando s??lo habia un bot??n `round` o `circle`, #11605
- Arreglado estilo del tama??o de p??gina del Select de Pagination, #11622
- Corregido un error del m??todo `open`  de los Men??s cuando se cambiaba din??micamente `collapse`, #11646
- A??adidos los par??metros `activeName` y `oldActiveName` al gancho before-leave de Tabs, #11713
- Arreglado el focus en Cascader despu??s de hacer clic fuera, #11588
- Arreglado que Cascader no se cerraba cuando se hacia clic en la opci??n estando `change-on-select` como `true`, #11623
- Ahora la actualizaci??n del valor de Select program??ticamente activar?? la validaci??n de formulario, #11672

### 2.4.1

*2018-06-08*

- Removida la declaraci??n duplicada de type en Autocompletar, #11388
- Corregido el estilo de flecha en el dropdown de Select en FireFox cuando se anidaba en el formulario, #11427
- Corregido que el ??cono `clear` de Select seguia apareciendo cuando el valor inicial era `null`, #11460
- Arreglado que cuando el radio estaba `disabled` mostraba el box-shadow al hacer click, #11462
- A??adido el atributo `iconClass` para MessageBox, #11499
- A??adido el atributo `stretch` para Tabs, #11476
- Arreglado el problema de orden de renderizado de TabPane cuando Tabs es `lazy`, #11461
- Arreglado que Table no retenia la fila actual de resaltados cuando se expandia, #11464
- Arreglado que  focusing state cuando `before-leave` devolvia una promesa resuelta, #11386
- Arreglado que Popover deshabilitado seguia creando poppers, #11426
- Arreglado el bucle sin fin de Tree cuando se a??adia un nuevo nodo en modo `lazy`, #11430 (por @wangjingf)
- A??adido el evento `closed` para Dialog, #11490

### 2.4.0 Fullerene

*2018-05-28*

#### Nuevas caracter??sticas
- Generalidades
  - La herramienta de desarrollo y el empaquetador se cambiaron a webpack nativo, #11216
  - Ahora puede configurar globalmente el z-index inicial de los popups, #11257
- Autocomplete
  - A??adido el atributo `hide-loading`, #11260
- Button
  - Ahora se puede usar el atributo `size` en los botones circulares para controlar sus tama??os, #11275
- InputNumber
  - A??adido el atributo `precision`, #11281
- Tabs
  - A??adido el atributo `before-leave`, #11259
  - A??adido el atributo `lazy`, #11167???by @Kingwl???
- Table
  - A??adido el m??todo `sort` para ordenar manualmente la tabla, #11311

#### Correcci??n de errores
- Input
  - Se ha corregido un problema que provocaba que se volviera a procesar al utilizar el IME chino para introducir texto r??pidamente, #11235 (por @STLighter).
- Popover
  - Corregido el error de la consola cuando el elemento disparador es Radio o Checkbox, #11265
- Breadcrumb
  - Arreglado el atributo `to` que no soportaba la actualizaci??n din??mica, #11286
- Upload
  - Corregido el error de la consola cuando se resolvia el Archivo en la Promesa devuelta del m??todo `beforeUpload`, #11297 (por @qusiba)
- Tooltip
  - Solucionado que la flecha no se  posicionaba correctamente cuando el contenido estaba vac??o, #11335
- Autocompletar
  - Corregido que  las sugerencias de entrada eran  incorrectas despu??s de eliminar la palabra clave r??pidamente, #11323
- ColorPicker
  - Corregido el evento `active-change` que se disparaba incorrectamente cuando el men?? desplegable del picker estaba cerrado, #11304
- Table
  - Corregido el error de estilo del panel de filtro cuando se sobredimensionaba, #11314
  - Corregida que la fila seleccionada actualmente no se retenia cuando se ordenaba la tabla, #11348
- CheckBox
  - Arreglado que cuando el checkbox era ??nico no soportaba validaci??n, #11271
- Radio
  - Arreglado que el Radio desactivado seguia estando seleccionada cuando se pulsaba la tecla espaciadora, #11303
- MessageBox
  - Corregida la clase `el-popup-parent--hidden` que no se eliminaba al abrir MessageBox sucesivamente, #11371

### 2.3.9

*2018-05-18*

- Corregido que cuando los datos de origen no tenian el campo especificado por el atributo `prop` de una TableColumn, se produc??a un error al moverse el rat??n dentro de las celdas de esa columna, #11137.
- El atributo `lockScroll` de los componentes pop-up ya no a??ade un inline style al elemento padre, sino que a??ade un nombre de clase, #1111114.
- Arreglado el icono de Progreso que no se mostraba cuando su `status` era `exception`, #11172
- El atributo `disabled` no funcionaba en la lista de resultados del filtro de Cascader, #11185
- Se ha corregido un problema por el que la fila expandida de la Tabla no se pod??a contraer si los datos de origen se actualizaban despu??s de su expansi??n, #11186.
- `setCurrentKey` de Tree ahora acepta `null` como par??metro para cancelar el nodo actualmente resaltado, #11205

### 2.3.8

*2018-05-11*

- Corregido que el panel DatePicker saltaba al mes actual despu??s de escoger una fecha en un mes diferente cuando el tipo era `dates`, #10973
- Arreglado que el `clearable Input` segu??a mostrando el icono de borrado cuando era s??lo de lectura, #10912
- Arreglado que al cerrar el panel DatePicker sin modificar el valor se desencadenaba incorrectamente el evento `change`, #11017
- Arreglado que la navegaci??n por el teclado no funcionaba correctamente cuando Select tenia opciones agrupadas, #11058
- Agregado el `slot named` `prefix` para Select, #11063
- Agregado  el metodo `clearValidate` para FormItem, #11076
- Agregado el atributo `checkOnClickNode` para Tree, #11111

### 2.3.7

*2018-04-29*

- Corregido que Table no actualizaba el ancho de encabezado cuando la barra de desplazamiento desaparecia debido al filtrado, #10834
- Corregido input borrable que mostraba el icono de borrado cuando su valor inicial era `nulo`, #10912
- Corregido el disparador incorrecto del evento `active-change` despu??s de cambiar el valor enlazado de ColorPicker program??ticamente, #10903 (por @zhangbobell)
- Corregido filterable Select que causaba un bucle infinito al navegar por las opciones usando el teclado si todas las opciones est??ban deshabilitadas, #10945

### 2.3.6

*2018-04-21*

- Corregido el comportamiento incorrecto del callback  `allow-drop` de Tree cuando se usaba el par??metro `type`, #10821
- Ahora puede introducir correctamente las palabras clave en filterable Single Select en IE11, #10822
- Corregido Single Select activaba incorrectamente el evento `blur` despu??s de hacer clic en una opci??n, #10822

### 2.3.5

*2018-04-20*

- Arreglado los incorrectos realces en el panel de DatePicker cuando `type` es week, #10712
- Arreglado que InputNumber comenzaba vacio cuando el valor inicial era 0, #10714
- Agregado el atributo  `automatic-dropdown` para Select, #10042 (by @Seebiscuit)
- Arreglado que el valor del Rate pasaba a `disabled` cuando se comenzaba a actualizar con las teclas de navegacion, #10726 (by @Richard-Choooou)
- Ahora el atributo `type` de DatePicker's puede ser  `'dates'`, donde puede elegir varias fechas en un solo picker, #10650 (by @Mini256)
- Agregados los eventos  `prev-click` y `next-click` para Pagination, #10755
- Agregado el atributo `pager-count` para Pagination, #10493 (by @chongjohn716)
- Agregado `type` como 3rd parametro del atributo  `allow-drop`  de Tree, #10792
- Ahora usamos ResizeObserver para detectar el redimensionamiento de elementos DOM, #10779

### 2.3.4

*2018-04-12*

- Eliminado el atributo duplicado  `showTimeout` en SubMenu's en la declaracion TypeScript, #10566 (by @kimond)
- Ahora se puede personalizar los datos de los items de Transfer usando scoped slot, #10577
- Arreglado que los click de los botones `next` y `prev`  en Pagination se deshabilitaban cuando se disparaba el evento  `current-change`, #10628
- Arreglado que Textarea mostraba `undefined` en SSR cuando el valor no era asignado, #10630
- Arreglado que se deshabilitaba el estilo del TabItem cuando  `type` era border-card, #10640
- Agregado `$index` como cuarto parametro en el atributo de las columnas de Table  `formatter` , #10645
- Arreglado que CheckboxButton no se exportaba en la declaracion de TypeScript, #10666

### 2.3.3

*2018-04-04*

- Agregar atributo `shadow` para Card, #10418 (by @YunYouJun)
- Se ha corregido el error de ocultar Badge cuando `value` es `0`, #10470
- Arreglados algunos bugs del draggable Tree, #10474 #10494
- Agregado `placement` para Autocomplete, #10475
- Ahora el atributo `default-time` tambi??n funciona en un rango que no es el rango DateTimePicker, #10321 (by @RickMacTurk)
- Eliminado el contorno azul de TabItem despu??s de que el navegador se desdibuja o se minimiza, #10503
- Agregado el atributo `popper-append-to-body` para SubMenu, #10515
- Eliminado el feedback visual cuando se desplaza sobre non-link BreadcrumbItem, #10551
- Se ha corregido el evento `change` de InputNumber para garantizar que el valor de ligado del componente se actualiza en el control de eventos, #10553

### 2.3.2

*2018-03-29*

- Arreglada una regresi??n de Autocompletar, #10442

### 2.3.1

*2018-03-29*

- Se ha corregido una regresi??n por la que el `type` de input no se transmitia al elemento de entrada nativo, #10415
- Agregado el metodo `blur` para Select, #10416

### 2.3.0 Diamond

*2018-03-28*

#### Nuevas caracter??sticas
- Table
  - Ahora `formatter` de TableColumn puede ser actualizado din??micamente, #10184 (by @elfman)
  - Agregado el atributo  `select-on-indeterminate`, #9924 (by @syn-zeta)
- Menu
  - Agregado el atributo `collapse-transition`, #8809 (by @limichange)
- Input
  - Agregado el metodo `select` , #10229
  - Agregado el metodo `blur`, #10356
- ColorPicker
  - Agregado el atributo `predefine`, #10170 (by @elfman)
- Tree
  - Agregados los atributos `draggable`, `allow-drop` y `allow-drag`, y los eventos `node-drag-start`, `node-drag-enter`, `node-drag-leave`, `node-drag-over`, `node-drag-end` y `node-drop`, #9251 #10372 (by @elfman)
- Form
  - El metodo `validate` ahora acepta un segundo parametro, que contiene informaci??n de los ??tems  del formulario que no superaron la validaci??n, #10279
  - Agregado el evento  `validate`, #10351
- Progress
  - Agregado el atributo `color`, #10352 (by @YunYouJun)
- Button
  - Agregado el atributo `circle`, #10359 (by @YunYouJun)

#### Bug's arreglados
- Form
  - Solucionado: Label del FormItem no se alineaba adecuadamente con Input mixto, #10189
- Menu
  - Ahora collapsed Menu s??lo mostrar?? el Tooltip cuando el slot `title` de MenuItem est?? configurado, #10193 (by @PanJiaChen)
- Pagination
  - Corregido el evento  `current-change`  que se disparaba err??neamente sin interacci??n del usuario, #10247
- DatePicker
  - Ahora la fecha y la hora en el panel desplegable est??n correctamente formateadas seg??n el atributo `format`, #10174???by @remizovvv???
- Upload
  - Solucionado el atributo `accept` no trabajaba cuando `drag` era true, #10278

### 2.2.2

*2018-03-14*

- Agregado el evento `clear` para Input, #9988 (by @blackmiaool)
- Ahora la entrada manual de ColorPicker soporta los modos `hsl`, `hsv` y `rgb`, #9991
- Arreglado DatePicker no desencadenaba el evento `change` cuando se borraba su valor inicial, #9986
- Ahora la clase de iconos relacionadas con los atributos de Rate soporta actualizaciones dinamicas, #10003
- Arreglado Table que con columnas `fixed` no actualizaban correctamente su altura si se fijaba `max-height`, #10034
- Ahora DatePicker en modo rango admite la selecci??n inversa (haciendo clic en la fecha final y, a continuaci??n, haciendo clic en la fecha de inicio), #8156 (by @earlymeme)
- Agregado el atributo `disabled` para Pagination, #10006
- Agregados los eventos `after-enter` y ` after-leave` para Popover, #10047
- Arreglado Select no disparaba validaci??n cuando el usuario seleccionaba una opci??n despu??s de ejecutar `resetFields` de Form, #10105
- Arreglado anchos incorrectos de columnas fijas de Table en algunos casos, #10130
- Corregido MessageBox heredaba el atributo `title` de su instancia anterior cuando se llamaba sin `title`, #10126 (by @Pochodaydayup)
- Agregado el atributo `input-size` para Slider, #10154
- Agregados los eventos  `left-check-change` y `right-check-change` para Transfer, #10156

### 2.2.1

*2018-03-02*

- Corregido Aside, Header y Footer que se contraia en algunos layout, #9812
- Corregido Table con un atributo `height`  no renderizaba en SSR, #9876
- Corregido Table con fila expandible no calculaba la altura cuando la fila era expandida, #9484
- Corregido que cuando se escribia la fecha de forma manual en DateTimePicker no se disparaba el evento  `change`, #9913
- Corregido que Select mostraba sus opciones cuando se hacia click con el bot??n derecho del mouse en el Input, #9894 (by @openks)
- Agregado el atributo `tooltip-class` para Slider, #9957
- Ahora Select permanecera enfocado despues de la selecci??n, #9857 (by @Seebiscuit)
- Agregado el atributo `target-order` para Transfer, #9960

### 2.2.0 Graphite

*2018-02-12*

#### New features
- Menu
  - Agregados los atributos  `popper-class` y `disabled` para SubMenu, #9604 #9771
  - Menu Horizontal ahora soporta SubMenu multi-capas, #9741
- Tree
  - Agregado el evento `node-contextmenu`, #9678
  - Ahora se puede personalizar el template del nodo usando scoped slot, #9686
  - Agregados los metodos  `getNode`, `remove`, `append`, `insertBefore`, `insertAfter`, `getCheckedKeys`, `getHalfCheckedNodes`, `getHalfCheckedKeys` y el evento `check`, #9718 #9730
- Transfer
  - Agregado el metodo `clearQuery`, #9753
- Select
  - Agregado el atributo `popper-append-to-body`, #9782

#### Bug fixes
- Table
  - Corregido el icono de expansi??n de una fila expandible que al hacer click activaba el evento `row-click`, #9654
  - Corregido el layout que no se actualizaba cuando el ancho de columna era cambiado por el usuario arrastrando, #9668
  - Corregido problema de estilo cuando la fila de resumen coexistia con columnas fijas, #9667
- Container

  - Corregido componentes del Container que no se estiraban en IE11, #9655
- Loading

  - Corregido Loading no se mostraba cuando el valor de `v-loading` era cambiado a true en el `hook`  `mounted`, #9722
- Switch
  - Corregido se disparaban los dos eventos nativos de click cuando se hacia click en el Switch, #9760

    

### 2.1.0 Charcoal

*2018-01-31*

#### New features
- Cascader
  - Agregados los eventos `focus` y `blur`, #9184 (by @viewweiwu)
- Table
  - El `filter-method` ahora tiene un tercer par??metro `column`, #9196 (by @liyanlong)
- DatePicker
  - Agregados los atributos `prefix-icon` y `clear-icon`, #9237 (by @AdamSGit)
  - Agregado el atributo `default-time`, #9094 (by @nighca)
  - `value-format` ahora soporta `timestamp`, #9319 (by @wacky6)
- InputNumber
  - Ahora el valor vinculado puede ser `undefined`, #9361
- Select
  - Agregado el atributo `auto-complete`, #9388
- Form
  - Agregado el atributo `disabled`, #9529
  - Agregado el atributo `validateOnRuleChange`, #8141
- Notification
  - Agregado el metodo `closeAll`, #9514

#### Bug fixes
- InputNumber
  - Arreglado el reseteo del valor cuando tiene punto decimal, #9116
- Dropdown
  - Arreglado el dropdown menu que tenia un posicionamiento incorrecto cuando la p??gina s??lo tiene una barra de desplazamiento horizontal en algunos navegadores, #9138 (by @banzhuanmei)
- Table
  - Corregido un error en el c??lculo del n??mero de columnas fijas despu??s de que los datos de la columna cambian, #9188???by @kolesoffac???
  - Corregido el borde de la ??ltima columna de la cabecera agrupada que no se visualizaba correctamente., #9326
  - Corregido el posicionamiento incorrecto del header de la tabla en Safari, #9327
  - Corregido fila expandida colapsaba cuando cambiaban los datos de la tabla, #9462
  - Corregido renders m??ltiples innecesarios en algunas condiciones, #9426
  - Corregido un error de calculo en el ancho de la columna cuando `width` cambiaba en TableColumn, #9426
- Loading
  - Corregido que en algunas ocasiones el loading no se ocultaba correctamente, #9313
- DatePicker
  - Corregido el metodo `focus` que no funcionaba en modo `range`, #9437
  - Corregido si se hacia clic en el bot??n "now" seguia seleccionando la fecha actual aunque estuviera desactivado, #9470 (by @wacky6)
  - Corregido fijaci??n de fechas al navegar, #9577 (by @wacky6)
- Steps
  - Corregido error de estilos en IE 11, #9454

#### Breaking changes
- Menu
  - El men?? desplegable en modo `collapse` ahora se agrega directamente al `body`, de modo que es visible cuando est?? anidado en Aside, #9263
- Table
  - Ahora, al marcar los checkboxes en la Tabla de selecci??n m??ltiple no se activa el evento `row-click`, #9467
- Loading
  - El `z-index` de la m??scara de carga non-fullscreen se cambia a 2000. El `z-index` de la m??scara de carga fullscreen se actualiza din??micamente con los componentes emergentes, #9522
- Dropdown
  - Los atributos `show-timeout` y `hide-timeout` ahora solo trabajan si se dispara `hover`, #9573

### 2.0.11

*2018-01-08*

- Corregido el problema de color del borde del Select cuando est?? el slot `prepend` o `append`  del Input, #9089
- Corregido el par??metro  `remove-tag` de Select, #9090
- A??adido los atributos `show-timeout` y `hide-timeout` para SubMenu, #8934 (por @HugoLew)
- Corregido el estilo de Tooltip de  `show-overflow-tooltip`  que faltaba cuando Table era importada bajo demanda, #9130
- Se ha corregido el mal funcionamiento de ordenaci??n de la columna de Table despues que  `clearSort`  era ejecutado en esa columna, #9100 (por @zEmily)
- El fichero de configuraci??n i18n para el checo se renombra de `cz` a `cs-CZ`, #9164

### 2.0.10

*2017-12-29*

- Corregido el calculo incorrecto de la altura m??xima de Table cuando fixed column y summary row coexisten, #9026
- Solucionado el estilo de color que no lo compilaba para textos vac??os en Table, #9028
- Ahora DatePicker s??lo emite el evento `change` cuando el valor cambia verdaderamente, #9029 (by @remizovvv)
- A??adido atributo `tabindex` para Input, #9041 (by @dicklwm)

### 2.0.9????

*2017-12-24*

- A??adida la funci??n de enganche (hook) `before-remove`  para Upload, #8788 (by @firesh)
- Arreglado el valor inicial de error que no funcionaba para FormItem, #8840
- Ahora la directiva Loading soporta nombre de clase personalizado asignando el atributo `element-loading-custom-class`, #8826 (por @earlymeme)
- Arreglado CarouselItem que se pon??a invisible cuando los datos eran actualizados asincr??nicamente, #8921
- A??adido el atributo `renderAfterExpand` para Tree, #8972

### 2.0.8

*2017-12-12*

- Agregada la documentacion en espa??ol
- Arreglado `show-timeout` de Dropdown que no funcionaba cuando se disparaba el click, #8734 (por @presidenten)
- Arreglado el tiempo de validacion del Form cuando se disparaba el blur, #8776
- Arreglado el evento de perdida de foco (blur) del DatePicker por rangos, #8784
- `format` de TimePicker ahora soporta AM/PM, #8620 (por @firesh)

### 2.0.7

*2017-11-29*

- Solucionado el estilo disabled en el texto de button, #8570

### 2.0.6

*2017-11-29*

- Corregido error de estilo de los iconos de ordenaci??n de Table, #8405
- Corregido activacion para Popover cuando `trigger` es manual, #8467
- A??adidos los atributos `prefix-icon` y `suffix-icon`  para Autocomplete, #8446 (por @liyanlong)
- A??adido el atributo `separator` para Cascader, #8501
- A??adido atributo `clearable` para Input, #8509 (por @lbogdan)
- A??adido atributo `background` para Pagination, #8553

### 2.0.5

*2017-11-17*

- Solucionado regresion en 2.0.4 de Popover, Tree, Breadcrumb and Cascader, #8188 #8217 #8283
- Solucionado Fuga de memoria de la directiva clickoutside, #8168 #8225 (por @badpunman @STLighter)
- Solucionada la altura en multiple Select cuando se borra su valor, #8317 (por @luciy)
- A??adido el atributo `collapse-tags` para multiple Select  para reemplazar las tags con una l??nea de texto, #8190
- Solucionado el alto consumo de CPU causado por Table cuando esta oculta, #8351
- Ahora puede usar el m??todo `doLayout` de Table para actualizar su dise??o, #8351

### 2.0.4

*2017-11-10*

- Accesibilidad mejorada para Cascader, Dropdown, Message, Notification, Popover, Tooltip y Tree
- Arreglado el cambio de tama??o del Container cuando el ancho de la vista disminuye, #8042
- Arreglado Tree's `updateKeyChildren` borraba incorrectamente los nodos hijos, #8100
- Arreglado la altura de los bordes de CheckboxBot??n's cuando esta anidado en un Form, #8100
- Arreglado error de an??lisis de los Menu's para los colores personalizados, #8153 (por @zhouyixiang)

### 2.0.3

*2017-11-03*

- Solucionado atributos `editable` and `readonly` de DatePicker de los rangos, #7922
- Corregido error de estilo de los Tabs anidados, #7941
- Corregido error de estilo del ??ltimo Step de Steps verticales, #7980
- Corregido el tiempo de activaci??n del evento `current-change`  para Pagination, #7995
- Corregido Tooltip no registrado en el Menu, #7995

### 2.0.2

*2017-10-31*

- Ahora haciendo clic con el bot??n derecho del rat??n en los botones de InputNumber no cambiar?? su valor, #7817
- El metodo `validate` de Form ahora puede esperar por validaciones as??ncronas antes de ejecutar su devoluci??n de llamada, #7774 (por @Allenice)
- Corregido la selecci??n de rango de DatePicker no funcionaba en los navegadores Chromium 53-57, #7838
- Corregido la perdida de previsualizaci??n e iconos de eliminar de Upload cuando su `list-type` es picture-card, #7857
- A??adido el atributo `sort-by` para TableColumn, #7828 (por @wangfengming)
- Corregido que a veces DatePicker muestra un n??mero de a??o incorrecto al seleccionar la primera semana en modo week, #7860 (por @hh23485)
- Corregido error de estilo de icono de Step vertical, #7891
- El ??rea hot para las flechas de nodo en Tree se expandia, #7891

### 2.0.1

*2017-10-28*

- Corregido error de estilo de RadioButton y CheckboxButton, #7793
- Corregido TimePicker no responde al desplazamiento del rat??n en algunas condiciones, #7811
- Corregido estilos incompletos de algunos componentes cuando se importan bajo demanda, #7811

### 2.0.0 Carbon

*2017-10-27*

#### New features

- General
  - Un nuevo tema:  `theme-chalk`
  - Se ha mejorado la accesibilidad de los siguientes componentes: Alert, AutoComplete, Breadcrumb, Button, Checkbox, Collapse, Input, InputNumber, Menu, Progress, Radio, Rate, Slider, Switch, Upload
  - A??adido tipograf??as TypeScript
  - Todos los iconos existentes son redise??ados. Se han a??adido algunos iconos nuevos
  - A??adida una serie de clases de utilidades basadas en puntos de ruptura que ocultan elementos cuando el tama??o del viewport cumple ciertas condiciones
  - Componentes de dise??o a??adidos: Container, Header, Aside, Main, Footer.
  - Ahora puede configurar los tama??os de componentes a nivel global. Al importar Element, puede a??adir un objeto de configuraci??n global con un prop `size` para configurar tama??os predeterminados para todos los componentes.
- Button
  - Atributo `round` a??adido. Se usa para botones de esquinas redondas #6643
- TimeSelect
  - Ahora puede ser navegado por  `Up` y `Down`, y presionando `Enter` selecciona la hora #6023
- TimePicker
  - Ahora puede ser navegado por  `Up` y `Down`, y presionando `Enter` selecciona la hora #6050
  - A??adido `start-placeholder` y `end-placeholder`. Son placeholder's para las dos casillas de input en modo range #7169
  - A??adido el atributo `arrow-control` para hacer girar el tiempo con las flechas #7438
- Tree
  - Ahora los nodos hijo no se renderizan antes de la primera expansi??n #6257
  - A??adido el atributo `check-descendants`. Determina si los nodos hijo se seleccionan al seleccionar su nodo padre en modo `lazy` #6235
- Tag
  - Atributo `size` a??adido #7203
- Datepicker
  - Ahora `timeFormat` puede dar formato al TimePicker cuando type est?? configurado en `datetimerange` #6052
  - A??adido `start-placeholder` y `end-placeholder`. Son placeholder's para las dos casillas de input en modo range #7169
  - Atributo `value-format` a??adido para personalizar el formato del valor enlazado, #7367
  - A??adido el atributo `unlink-panels` para desacoplar los dos paneles de fechas al seleccionar un rango.
- MessageBox
  - A??adido el atributo `closeOnHashChange` #6043
  - Atributo `center` agregado para que el contenido pueda ser centrado #7029
  - A??adido atributo `roundButton` para mostrar Botones redondeados #7029
  - A??adido atributo  `dangerouslyUseHTMLString`. Cuando est?? configurado en true, el mensaje ser?? analizado como cadena HTML<sup>*</sup> #6043
  - A??adido atributo `inputType` para asignar el tipo para el input interno, #7651
- Dialog
  - A??adidos los atributos `width`, `fullscreen`, `append-to-body`. Ahora Dialog puede ser anidado
  - Atributo `center` agregado para que el contenido pueda ser centrado #7042
  - A??adidos  `focus-after-closed`, `focus-after-open`  para mejorar la accesibilidad #6511
- ColorPicker
  - Ahora puede escribir colores en el input #6167
  - A??adidos atributos `size` y `disabled` #7026
  - A??adido atributo `popper-class` #7351
- Message
  - Ahora el color de los iconos puede ser sustituido por CSS #6207
  - A??adido atributo  `dangerouslyUseHTMLString`. Cuando est?? configurado en true, el mensaje ser?? analizado como cadena HTML<sup>*</sup> #6207
  - Atributo `center` agregado para que el contenido pueda ser centrado #6875
- Notification
  - A??adido atributo `position` para configurar donde aparece Notification #6231
  - A??adido atributo `dangerouslyUseHTMLString` . Cuando est?? configurado en true, el mensaje ser?? analizado como cadena HTML<sup>*</sup> #6231
  - A??adido el atributo `showClose` para ocultar el bot??n de cierre #6402
- Rate
  - A??adido el atributo `show-score` para determinar si la puntuaci??n actual se muestra #6295
- Tabs
  - A??adido el atributo `tab-position`  #6096
- Radio
  - A??adidos los atributos `border` y `size`  #6690
- Checkbox
  - A??adidos los atributos `border` y `size`  #6690
- Alert
  - Atributo `center` agregado para que el contenido pueda ser centrado #6876
- Menu
  - A??adidos los atributos  `background-color`, `text-color` y `active-text-color` #7064
  - A??adidos los methods  `open` and `close` para abrir y cerrar los SubMenu con programaci??n, #7412
- Form
  - A??adido el atributo  `inline-message`  para determinar si el mensaje de validaci??n se muestra inline #7032
  - A??adido el atributo `status-icon` para mostrar un icono de retroalimentaci??n cuando se valida #7032
  - Form y FormItem ahora tienen un atributo `size`. Los componentes internos heredar??n este tama??o si no se especifica en ellos mismos, #7428
  - M??todo `validate` devolver?? ahora una promesa si se omite la llamada de retorno, #7405
  - A??adido m??todo `clearValidate` para limpiar los resultados de las validaciones de todos los form items, #7623
- Input
  - A??adido slots con nombres `suffix` y `prefix` y atributos `suffixIcon` y `prefixIcon`  para a??adir contenido dentro del input #7032
- Breadcrumb
  - A??adido el atributo `separator-class` para dar soporte a los iconos como separadores de items #7203
- Steps
  - A??adido atributo `simple` para activar Steps de estilo sencillo #7274
- Pagination
  - A??adidos los atributos `prev-text` y `next-text` para personalizar los textos de la p??gina anterior y de la p??gina siguiente #7005
- Loading
  - Ahora usted puede personalizar el ??cono del spinner y el color de fondo con los props  `spinner` y `background` , #7390
- Autocomplete
  - A??adido atributo `debounce`, #7413
- Upload
  - A??adidos los atributos `limit` and `on-exceed` para limitar la cantidad de archivos, #7405
- DateTimePicker
  - A??adido el atributo `time-arrow-control` para activar `arrow-control` del TimePicker anidado, #7438
- Layout
  - A??adido un nuevo breakpoint `xl` para viewport m??s ancho que 1920px
- Table
  - A??adido el atributo `span-method` para combinar celdas
  - A??adido el m??todo `clearSort` para borrar la clasificaci??n program??ticamente
  - A??adido el m??todo `clearFilter` para limpiar el filtro de forma program??tica
  - Para las filas ampliables, cuando se ampl??a una fila, se a??adir?? una clase `.expanded` a su lista de clases, para que pueda personalizar su estilo.
  - Atributo de `size` a??adido
  - A??adido el m??todo `toggleRowExpansion` para expandir o contraer filas expandibles program??ticamente.
  - A??adido el atributo `cell-class-name` para asignar el nombre de la clase para las celdas
  - A??adido atributo `cell-style` para dar estilo a las celdas
  - A??adido atributo `header-row-class-name` para asignar el nombre de clase para las filas de encabezado.
  - A??adido un atributo `header-row-style` para el estilo de encabezado
  - A??adido el atributo `header-cell-class-name` para asignar el nombre de la clase para las celdas de encabezado.
  - A??adido el atributo `header-cell-style` a las celdas de encabezado de estilo
  - El atributo prop de TableColumn ahora acepta las notaciones  `object[key]`
  - Atributo de `index` a??adido para TableColumn para personalizar ??ndices de filas
- Select
  - A??adido el atributo `reserve-keyword` para reservar la palabra clave de b??squeda actual despu??s de seleccionar una opci??n.

#### Bug fixes

- DatePicker
  -  Arreglado  `v-model`  que devolvia el segundo d??a de la semana seleccionada en modo week #6038
  -  Arreglado el primer input comenzaba borrado con el type `daterange`  #6021
- DateTimePicker
  - Arreglado DateTimePicker y TimePicker que se afectaban entre s?? cuando se seleccionaban #6090
  - Arreglado la hora y el segundo podian estar m??s all?? del l??mite al seleccionar el tiempo #6076
- TimePicker
  - Arreglado `v-model` que no se actualizaba correctamente cuando no tenia el foco #6023
- Dialog
  - Arreglado textos que tenian bordes borrosos al abrir y cerrar dropdowns anidados #6088
- Select
  - Rendimiento mejorado. Ahora Vue dev-tool no se bloquear?? cuando un gran n??mero de Selects sean destruidos #6151
- Table
  - Corregido un bug de Table permanec??a oculto cuando su elemento padre tenia el atributo   `display: none`
  - Arreglado Table ahora amplia su ancho cuando el elemento padre tiene `display: flex`
  - Arreglado un bug que correg??a las columnas de una tabla con slot con nombre  `append`   que  desaparecia cuando los datos eran recuperados din??micamente.
  - Arreglado el atributo `expand-row-keys` que no funcionan con el valor inicial
  - Fallo del filtro corregido al actualizar los datos
  - Se ha corregido un error de c??lculo de la disposici??n de columnas fijas con cabeceras agrupadas.
  - Corregido un error de `max-height` din??mico
  - Corregidos algunos errores de c??lculo de estilo

#### Breaking changes

- General
  - Eliminado `theme-default`
  - Compatible con Vue 2.5.2+ e IE 10+
  - Evento `change`  de componentes del formulario y evento `current-change` de Pagination ahora s??lo se activa en la interacci??n del usuario.
  - El atributo `size` del bot??n y los componentes del formulario aceptan ahora los tama??os `medium`, `small` y `mini`.
  - Para facilitar el uso de iconos de terceros, los atributos `icon` de Button y Steps y los atributos  `prefix-icon` y `suffix-icon`  del input ahora requieren un nombre de clase completo.
- Dialog
  - Atributo `size` eliminado. Ahora el tama??o de Dialog se puede configurar con  `width` y `fullscreen`
  - Ahora la visibilidad del Di??logo no puede ser controlada por `v-model`
- Rate
  - `text-template` a sido renombrado a `score-template`
- Dropdown
  - `menu-align` a sido renombrado a `placement`. Ahora soporta m??s posiciones
- Transfer
  - `footer-format` a sido renombrado a `format`
- Switch
  - Los atributos que comienzan con `on*` ser??n analizados en eventos en JSX, haciendo que todos los atributos `on*` de Switch no puedan trabajar en JSX. Por lo tanto, los atributos `on*` se renombran a `active-*`, y por consiguiente los atributos `off-*` se renombran a `inactivado-*`. Este cambio afecta a los siguientes atributos:  `on-icon-class`, `off-icon-class`, `on-text`, `off-text`, `on-color`, `off-color`, `on-value`, `off-value`.
  - Los atributos `active-text` y `inactive-text`  ahora no tienen valores por defecto.
- Tag
  - El atributo type acepta ahora  `success`, `info`, `warning` y `danger`
- Menu
  - Atributo `theme` eliminado. El color de Menu se puede configurar utilizando  `background-color`, `text-color` y `active-text-color`
- Input
  - Atributo `icon` eliminado. Ahora el icono del sufijo puede configurarse usando el atributo  `suffix-icon`  o el slot con nombre `suffix`.
  - Eliminado el atributo `on-icon-click` y el evento `click`. Ahora para a??adir el manejador de clics en los iconos, por favor use los slots con nombre.
  - El evento `change` se comporta ahora como el nativo, que se activa s??lo en la perdida del foco o presionando enter. Si necesita responder a las entradas de usuario en tiempo real, puede utilizar el evento `input`.
- Autocomplete
  - Atributo `custom-item` eliminado. Ahora la plantilla de sugerencias del input se puede personalizar utilizando `scoped slot`
  - Atributo  `props`  eliminado. Ahora puede utilizar el atributo `value-key` para designar el nombre de la clave del objeto de sugerencia del input para su visualizaci??n.
- Steps
  - Atributo `center` eliminado
  - Ahora Steps llenara su contenedor padre por defecto
- DatePicker
  - Los par??metros del evento `change` de DatePicker son ahora el valor vinculante en s?? mismo. Su formato es controlado por `value-format`
- Table
  - Soporte eliminado para personalizar la plantilla de columnas mediante `inline-template`
  - `sort-method` ahora se alinea con `Array.sort`. Deber??a devolver un n??mero en lugar de un booleano
  - El slot `append`  se desplazo fuera del elemento `tbody` para evitar m??ltiples renderizados.
  - Evento `expand` se renombro a `expand-change`
  - Los parametros de los m??todos  `row-class-name` y `row-style` son ahora un objeto

# #

<i><sup>*</sup> El procesamiento din??mico de HTML arbitrario en su sitio web puede ser muy peligroso porque puede conducir f??cilmente a [ataques XSS](https://en.wikipedia.org/wiki/Cross-site_scripting). Por lo tanto, cuando `dangerouslyUseHTMLString` est?? encendido, por favor aseg??rese de que el contenido de `message` es confiable, y **nunca** asigne el `message` al contenido proporcionado por el usuario.</i>``
