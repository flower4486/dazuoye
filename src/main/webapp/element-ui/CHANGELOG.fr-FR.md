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
  - Add support tree structure data (#14632 by @ziyoung)

#### Bug fixes

- Tabs
  - Use primary color as boxShadow color (#14558 by @Richard-Choooou)
  - Rerender when label changes (#14496 by @akki-jat)
- Table
  - Footer follows body cell align (#14730 by @ziyoung)
- NavMenu
  - Fix click el-submenu trigger childMenu pop again bug (#14443 by @PanJiaChen)
- Dropdown
  - Make compatible with 2.6 new v-slot syntax (#14832 by @ziyoung)
- ColorPicker
  - Fix handle error hex color string (#14793 by @iamkun)
- Tree
  - Revert pr #13349 (#14847 by @ziyoung)
- Tooltip
  - Display when initial value is true (#14826 by @ziyoung)
- Docs
  - Update cascader docs (#14442 by @panhezeng)
- Style
  - Fix media query in sm-only, md-only, lg-only (#14611 by @sinchang)

#### Optimization

- Chore
  - Add webpage description (#14802 by @iamkun)

### 2.6.3

*2019-03-21*

#### Bug fixes

- Fix Cascader demo style (#14789 by @ziyoung)
- Remove unnecessary DOM operation (#14788 by @ziyoung)
- Fix DatePicker default-value DST (#14562 by @wacky6)

### 2.6.2

*2019-03-21*

#### New features

- DatePicker
  - Add monthrange for type attribute (#14487 by @zxyRealm)
- i18n
  - Add Croatian locale (#14360 by @danijelh)

#### Bug fixes

- Input
  - Fix regression (#14572 by @wacky6)
- DatePicker
  - Fix first-day-of-week computation (#14523 by @sinchang)
  - Fix week picker's value-format (#13754 by @wacky6)
- Steps
  - Fix issue #14502 (#14596 by @sinchang)
  - Fix style with simple theme (#14610 by @sinchang)
- Docs
  - Update french doc for 2.6.1 and fix typos (#14555 by @smalesys)
  - Rename variable in Table docs (#14587 by @likwotsing)
  - Add french search index (#14565 by @iamkun)
  - Fix TimePicker page style (#14579 by @ziyoung)
  - Rename variable in Upload docs (#14593 by @liupl)
  - French translation update (#14643 by @smalesys)
  - Update Form async validator docs (#14694 by @iamkun)
  - Fix tooltip doc error (#14748 by @iamkun)
  - Fix typo (#14751 by @2bj)
  - Fix highlighting control elements for Webkit touch (#14703 by @VladG0r)

#### Optimization

- Chore
  - Update ci build script (#14600 by @ziyoung)
  - Update ga tracking (#14560 by @iamkun)
  - Add more ga event (#14633 by @iamkun)
  - Update discusion group (#14741 by @iamkun)
  - Update test deps and conf (#14735 by @wacky6)
  - Upgrade gulp (#14745 by @ziyoung)
  - Use codepen to display demo & fix doc error (#14747 by @ziyoung)

### 2.6.1

*2019-03-03*

#### Corrections de bugs

- **Ne pas sp??cifier la version de node** (par @iamkun dans #14546)
- Correction du r??pertoire doc dans `deloy-faas.sh` (par @ziyoung dans #14553)
- Correction d'un probl??me de style de date dans le changelog de la 2.6.0 (par @island205 dans #14547)
- Correction d'une typo dans la doc (par @wack6 dans #14552)

### 2.6.0

*2019-03-01*

#### Nouvelles fonctionnalit??s
- Timeline
  - Ajout d'un composant timeline (par @jikkai dans #14248)
- DropdownItem
  - Ajout de la propri??t?? `icon` ?? `el-dropdown-item` (par @gabrielboliveira dans #14088)
- Input
  - Ajout de propri??t??s pour afficher les mots de passe (par @phshy0607 dans #13966)
- Select
  - Ajout du slot `empty` (par @elfman au #13785)
- Autocomplete
  - Ajout de la propri??t?? `highlight-first-item` (par @YamenSharaf dans #14269)
- I18n
  - Cr??ation de la locale Arm??nienne (par @hamletbarsamyan dans #14214)
- Docs
  - Traduction fran??aise (par @smalesys dans #12153, #14418, #14434)

#### Optimisation
- Alert
  - Mise ?? jour de la classe du slot par d??faut de la description de Alert (par @iamkun dans #14488)
- Input
  - Mise ?? jour de l'input de type password (par @iamkun dans #14480)
- InputNumber
  - Retrait d'un parseFloat inutile (par @JuniorTour au #14172)
- Menu
  - Ajout du support de `el-menu-item` sans index (par @georgyfarniev dans #13298)
- Table
  - Suppression de certaines op??rations du DOM (par @elfman dans #13643)
- Upload
  - Optimisation du code (par @elfman dans #13973)
- Popup
  - Optimisation du code (par @KAionro dans #14413)
- Docs
  - Ajout de d??tails sur la fa??on d'ex??cuter le mode play pour les contributeurs (par @island205 dans #14355)
  - Ajout d'un avertissement concernant Input (par @wacky6 dans #14463)
  - Mise ?? jour de la doc de Table (par @luguokong dans #14329)
  - Mise ?? jour de la doc d'Input (par @iamkun dans #14437)
  - Mise ?? jour de la doc sur le th??me (par @wangguohaohao dans #14297)
  - Le style de l'ic??ne change lorsque vous passez dessus (par @tuxinghuan dans #14295)
- Build
  - Minification du CSS et du JS pour le site d'Element (par @iamkun dans #14430)
  - Acc??l??ration de webpack (par @hetech dans #14484)
  - Utilisation du cli pour s??lectionner la version de publication (par @hetech dans #14354)
- Installation de stale pour la gestion des issues (par @island205 dans #14392)

#### Corrections de bugs
- Menu
  - Correction d'un bug de focus des sous-menus lors du changement d'onglet du navigateur (par @liupl dans #13976)
- MessageBox
  - Correction de la d??finition du type (par @NateScarlet dans #14278)
- ScrollBar
  - Emp??che le clic droit sur le bouton du pouce (par @xifeiwu dans #14196)
- Switch
  - D??clenchement de la validation du formulaire si la valeur change (par @hetech dans #14426)
- Table
  - La m??thode toggleAllSelection est maintenant une m??thode d'instance (par @letanure dans #14075)
- Tabs & Dropdown
  - Correction du style (par @hetech dans #14452)
- Tree
  - Les tips sont diff??rents des tableaux (par @ColinCll dans #14331)
- Docs
  - Correction d'une erreur de doc du DatetimePicker (par @iamkun dans #14290)
  - Probl??me d'orthographe dans la documentation du DatePicker (par @helmut dans #14481)
  - Correction du style de la doc de Pagination(par @liuchuzhang dans #14451)

#### Breaking changes
- Table
  - Fix params order of row events (by @jikkai in #12086)
  
### 2.5.4

*2019-02-01*

#### Corrections de bugs

- Build: Correction d'un probl??me de configuration de babel qui cassait la transition collapse (par @island205 dans #14282)

### 2.5.3

*2019-01-31*

#### Optimisation

- Optimisation du code de Message (par @vok123 dans #14029)
- Suppression des gh-pages (par @ziyoung dans #14266)
- Ajout du lien IssueHunt (par @island205 dans #14261)

#### Corrections de bugs

- Correction d'une erreur du module UMD c??t?? serveur (par @island205 dans #14242)
- Correction du style du TabBar actif (par @iamkun dans #14240)
- Correction d'une erreur de code dans la d??mo de Table (par @xunmeng dans #14253)

### 2.5.2

*2019-01-27*

#### Optimisation
- Docs:
  - Mise ?? jour du ChangeLog ES 2.5.1 (par @Gonzalo2310 dans #14231)

#### Corrections de bugs
- Build:
  - Suppression des commentaires non supprim??s dans le module umd `lib/index.js` (par @island205 dans #14233)
  - Correction d'une erreur d'exportation dans le module commonjs utilis?? dans nuxt.js (par @island205 dans #14232)
  - Correction des probl??mes de build 2.5.1 (par @iamkun dans #14228)

### 2.5.1

*2019-01-26*

#### Optimisation
- DatePicker: surbrillance du mois et de l'ann??e courants (par @Debiancc dans #14211)
- Mise ?? jour du changelog 2.5.0 (par @wacky6 dans #14217)

#### Corrections de bugs
- Correction d'un probl??me d'exportation due par la mise ?? jour du webpack (par @island205 dans #14220)
- Conservation de la docs 2.4.11 && nouveau sous-dossier pour 2.5+ (par @iamkun dans #14222)

### 2.5.0

*2019-01-25*

#### Nouvelles fonctionnalit??s
- DatePicker
  - Ajout de l'attribut `validate-event` (par @ziyoung dans #13531)
- DateTimePicker
  - `pickerOptions` supporte l'option `selectableRange` (par @eeeeeeeeeeeason)
- Tag
  - Ajout de l'??v??nement `click` (par @licdream dans #14106)
- I18n
  - Support de la langue kirghize (par @zzjframework dans #14174)

#### Optimisation
- Mise ?? niveau vers webpack@4 (par @jikkai dans #14173)
- Input
  - Simplification de l'impl??mentation, suivant un flux de donn??es ?? sens unique. Correction de plusieurs bugs li??s. (par @wacky6 dans #13471)
- Mise ?? jour du fichier Axure avec de nouveaux composants (par @ziyoung dans #13773)

#### Corrections de bugs
- Autocomplete
  - Correction de la derni??re ligne du menu d??roulant qui ??tait coup??e (#13597) (par @ziyoung)
  - Correction d'une fl??che de popper manquante (#13762) (par @liuchuzhang)
- Carrousel
  - Nettoyage du timer lorsque le composant est d??truit (#13820) (par @elfman)
- Cascader
  - Suppression de la propri??t?? obsol??te des props calcul??es (#13737) (par @iamkun)
  - Correction de la d??finition du type CascaderOption dans TypeScript (#13613) (par @NateScarlet)
  - Correction de l'ic??ne couvrant le texte (#13596) (par @ziyoung)
- Checkbox
  - Refonte du style (par @PanJiaChen)
- DatePicker
  - Ajout d'un `key` de v-for manquant dans TimeSpinner (#13547) (par @Ende93)
  - Correction du surlignage de la semaine dans la bordure de l'ann??e (#13883) (par @suyi91)
- Input
  - Correction de la r??f??rence de textarea dans le DOM (#13803) (par @laomu1988 @island205)
- Pagination
  - La valeur d'entr??e ne sera pas inf??rieure ?? 1 (#13727) (par @elfman)
- Popover
  - Correction d'un probl??me de popover avec le d??clencheur de hover (#13104) (par @goldengecko)
  - Correction d'une fuite de m??moire de l'instance popper (#13988) (par @qpxtWhite)
- Radio
  - Refonte du style (par @ohhhoney1)
- Table
  - Am??lioration du tri des tables en cliquant sur la fl??che de tri (#12890) (par @ohhoney1)
  - Correction d'un probl??me d'alignement vertical du texte vide sur IE10+ (#13638) (par @imzjy)
  - Correction de la documentation sur le type d'index (#13628) (par @ilovefafafa)
  - Correction du probl??me d'affichage `show-summary` lorsque le header multi-niveaux est fixe (#13914) (par @luckyCao)
- Tabs
  - Correction d'un bug de d??filement automatique (#13696) (par @iamkun)
  - Obtenir l'onglet correct par le nom de l'onglet (#13705) (par @iamkun)
  - Utilisez paneName au lieu de name pour d??terminer le style du panneau (#13733) (par @iamkun)
- Tree
  - Correction de la propri??t?? `showCheckbox` sur `Tree` qui ne pouvait pas affecter leurs `tree-node` enfants(par @KidneyFlower)
  - Mise ?? jour des fichiers de doc et de d??finition (#13540) (par @ziyoung)
- Upload
  - Ajout de le propri??t?? `url` au fichier upload?? lorsque `list-type` est modifi?? (#13771) (par @elfman)
- Slider
  - Correction de l'indentation du code source (#13955) (par @wacky6)
- I18n
  - Ajout des traductions manquantes en catalan (par @jaumesala)
  - Ajout de la traduction russe manquante (#13658) (par @justlp)
  - Correction des traductions en finnois (#14137) (par @jenkrisu)
- Doc
  - Mise ?? jour de la documentation espagnol depuis la 2.4.11 (#13522) (par @Gonzalo2310)
- Autres
  - Suppression d'un script inutile (par @ziyoung)
  - Correction des ancres (#13753) (par @iamkun)
  - Correction de l'incoh??rence des majuscules dans la documentation (par @wonderjar)
  - Ajout du QR code du chat DingDing au readme (#13957) (par @iamkun)
  - Ajout des logs yarn au .gitignore (#13922) (par @mimimi)
  - Suppression du sponsor duotai (#14156) (par @island205)
  - Mise ?? jour du QR code dans le readme (#13960) (par @iamkun)
  - Mise ?? jour du lien CDN, correction d'une typo (par @ziyoung)

### 2.4.11

*2018-11-21*

- Revert pr #13296. Correction d'un clic sur Menu externe causant l'effondrement du SubMenu, #13478
- Ajustement des points de rupture media query sur petit ??cran (xs), #13468 (par @alekoshen712)

### 2.4.10

*2018-11-16*

- Correction des clics multiples sur Select pour afficher la liste d??roulante, #13268
- L'ic??ne d'effacement des champs n'est pas affich??e lorsque Form est d??sactiv??, #13208
- Ajustement des styles de Select, Progress, Autocomplete, Tooltip, Collaspe, TimePicker, #13188 (par @porcelainHeart) #13210 #13266 #13266 #13257 #13290 #13347 (par @PanJiaChen)
- Ajout de l'attribut `loop` dans le composant Carrousel, #13217
- Lorsque les donn??es de Table changent, la ligne en surbrillance reste, #13200
- Le slot du header de Table peut recevoir des param??tres, #13263
- La m??thode `clearFilter` de Table peut recevoir des arguments, #13176
- La bulle d'aide n'est plus cr????e lorsqu'il n'y a pas de contenu dans la cellule de Table, #13152 (par @rongxingsun)
- Le contenu de la zone de saisie du panneau ColorPicker peut ??tre affich?? correctement, #13278
- ColorPicker ne d??clenche plus la validation des formulaires lors du glisser-d??poser, #13299
- InputNumber: ajout de la m??thode `select`, #13286 (par @st-sloth)
- AutoComplete: ajout de l'??v??nement `clear`, #12171(par arthurdenner) #13326
- Vous pouvez fermer Menu en cliquant ?? l'ext??rieur, #13296
- La m??thode `validateField` du formulaire peut recevoir des arguments, #13319
- Cascader: ajout de l'??v??nement `visible-change`, #13415
- DatePicker: a ajout d'un slot pour les s??parateurs d'intervalle, #13272 (par @milworm)
- Tree: ajout des propri??t??s `iconClass` et `currentNodeKey`, #13337 #13197 (par @isnifer)
- Progress: ajout du texte de statut #13198 (par @ali-master)
- Correction de `defaultCheckedKeys` de Tree, #13349 (par @dive2Pro)

### 2.4.9

*2018-10-26*

- Le param??tre `clearValidate` de Form supporte les strings #12990 (par @codinglobster)
- Ajout de l'attribut `type` pour Badge, #12991
- Les utilisateurs peuvent utiliser scoped-slot pour personnaliser l'en-t??te de colonne de Table #13012 (par @ivanseidel)
- Correction du champ de Select incapable d'entrer du texte sous IE, #13034 (par @GaliMU)
- Les options Select ne s'enroule pas lorsque l'espace est suffisant, #12329 (par @akki-jat)
- Lorsque la liste d??roulante de Select est ouverte, l'ic??ne de la fl??che s'affichera ??galement correctement, #12353 (par @firesh)
- Correction de l'attribut de taille de Select qui ne fonctionnait pas, #13070
- La s??lection de plusieurs valeurs peut aussi ??tre effac??e, #13049 (par @ZSkycat)
- Correction du dernier TabNav qui ne pouvait pas ??tre supprim??, #13039
- Correction d'un probl??me d'affichage du label TabNav, #13178
- Ajout d'un slot de titre pour Alert, #13082 (par @Kingwl)
- Correction d'un probl??me o?? le contenu de l'infobulle de Table ??tait incorrect, #13159 (par @elfman)
- Optimisation de l'animation de Upload lorsque le fichier est supprim??, #12987
- Style ajust?? pour InputNumber lorsque le bouton de commande n'est pas affich??, #13052

### 2.4.8

- Ne pas afficher le contour lorsque le Switch est focus, #12771
- Correction du style de Dropdown dans ButtonGroup, #12819 (par @bluejfox)
- Ajout d'un ??v??nement d'ouverture pour Dialog, #12828
- Correction de l'ordre d'affichage incorrect de TabNav, #12846
- Correction d'un probl??me qui emp??chait les Tabs de d??filer jusqu'?? l'onglet s??lectionn??, #12948
- Correction d'un probl??me de l'identificateur qui ne s'affiche pas lorsque le noeud de Tree est gliss??, #12854
- Le param??tre de l'??v??nement validation du formulaire contient le message de validation #12860 (par @YamenSharaf).
- Correction de DatePicker pour ne pas v??rifier la validit?? du temps d'entr??e de l'utilisateur, #12898
- Correction d'un probl??me avec l'attribut `render-header` de l'en-t??te de table qui ne fonctionnait pas, #12914

### 2.4.7

*2018-09-14*

- Correction de DatePicker ne d??clenchant pas la validation du formulaire, #12328 #12348
- Correction des erreurs lanc??es par DatePicker en mode multiple, #12347
- Correction d'une position incorrecte du spinner de DatePicker, #12415 (par @rang-ali)
- Correction du remplissage automatique de la zone de saisie de DatePicker, #12521 (par @abdallanayer)
- Correction du champ non-subrillant dans Cascader, #12341
- Correction d'un mauvais ordre de Tabpane, #12346
- Correction d'une position incorrecte du curseur ColorPicker, #12376 (par @cnwhy)
- Correction du style de SubMenu, #2457
- Correction de la surbrillance apr??s la s??lection de SubMenu, #12479
- Correction des valeurs incorrectes s??lectionn??es par Cascader, #12508 (par @huangjinqiang)
- Correction d'une valeur incorrecte dans le champ d'entr??e Pagination, #12525
- Correction de l'ordre dans lequel la Pagination d??clenche les ??v??nements, #12530
- Correction des filtres de table non-affich??s, #12539
- Correction de l'arbre incapable de supprimer des n??uds, #12684
- Correction de la hauteur de Select Input changeant en mode simple, #12719
- Correction d'un style du label de FormItem sous forme imbriqu??e, #12748
- Ajout de l'attribut `autocomplete` pour Input, `auto-complete` devenant obsol??te, #12514 (par @axetroy)
- Ajout des slots-scope pour Form pour afficher les informations de validation, #12715 (par @YamenSharaf)

### 2.4.6

*2018-08-09*

- Correction de Table n'affichant pas l'ic??ne de filtre lorsque `filters` est un tableau vide, #12165
- Correction de Menu ne sauvegardant pas l'??tat actif lorsque `collapse` change, #12178 (par @elfman)
- Correction du Cascader n'??chappant pas les caract??res sp??ciaux poue les Regexp, #12248
- Correction d'un bouton Radio d??sactiv?? affichant l'ombre d'une case lorsqu'on clique dessus, #12262
- Correction de arrow key qui n'a pas d'effet lorsque la valeur par d??faut est `undefined`, #12322
- Correction de la fonction de requ??te de Select non-stabilis??e en mode multi, #12181
- Correction du mot-cl?? de la requ??te Select disparaissant en mode multi, #12304
- Correction d'une largeur incorrecte de Dialog lorsqu'il est affich?? en plein ??cran, #12203
- Correction de l'affichage incorrect de Main sur IE, #12237
- Correction de Input d??clenchant deux validations de formulaire, #12260
- Correction de l'ajout d'un nouveau n??ud d'arborescence provoquant la disparition des n??uds, #12256
- Correction d'un n??ud d'arborescence non supprim?? apr??s avoir gliss??, #12279
- Correction du Popover non-visible quand InputNumber a le focus, #12284
- Ajout de l'attribut `popper-append-to-body` pour Autocomplete, #12241
- Ajout du support du modificateur `sync` pour l'attribut `page-size` de Pagination, #12281

### 2.4.5

*2018-07-26*

- Correction du r??glage de Table `class-name` qui ne fonctionne pas pour les colonnes `expand`, #12006
- Ajout de la m??thode `toggleAllSelection` pour Table, #12047
- Correction d'une mauvaise position du slot de suffixe lorsque Input contient Select, #12108
- Correction de `line-height` de l'option impossible ?? r??gler, #12120
- Correction de TimeSelect avec la valeur par d??faut `null` ne pouvant ??tre assign?? apr??s avoir ex??cut?? `resetField`, #12010
- Correction d'un ??v??nement keydown qui n'??tant pas arrow key ne fonctionne pas dans Tree, #12008
- Correction d'un n??ud parent v??rifi?? en mode lazy, #12106
- Ajout du param??tre `includeHalfChecked` pour getCheckedNodes de Tree, #12014

### 2.4.4

*2018-07-13*

- Correction du d??clenchement de la validation de Select apr??s la r??initialisation du formulaire, #11837
- Correction d'une mauvaise position du slot `suffix` de Input lorsque le slot `suffixe` est avec le slot `append`, #11951
- Correction de Input affichant toujours l'ic??ne clear m??me en lecture seule, #11967
- Correction d'un n??ud d'arborescence coch?? lorsqu'il est d??sactiv??, #11847
- Correction des `default-checked-keys` qui ne fonctionnait pas, #11971
- Correction de `empty-text` non visible lorsque le noeud de Tree est filtr??, #11971
- Correction de la position du `empty-text` surdimensionn?? dans Table, #11965
- Correction de la surbrillance de la ligne de Table lorsque `current-row-key` est assign??e ?? `null`, #11866
- Correction de l'affichage de la liste d??roulante des filtres lorsque `filters` est un tableau vide, #11864
- Correction du label de Radio qui n'arr??te pas la propagation des ??v??nements, #11912

### 2.4.3

*2018-07-03*

- Correction de `allow-drop` qui ne fonctionnait pas correctement lorsque les n??uds de Tree avaient une hauteur personnalis??e, #11797
- Maintenant vous pouvez passer un param??tre ?? la m??thode `clearValidate` du formulaire, en sp??cifiant quels r??sultats de validation FormItems doivent ??tre effac??s, #11821
- Ajout de l'attribut `distinguishCancelAndClose` pour MessageBox, #11831

### 2.4.2

*2018-06-26*

- Maintenant `class-name` et `label-class-name` de Table sont r??actifs, #11626
- Correction de Table qui mettait toujours en surbrillance la ligne cliqu??e lorsque `highlight-current-row` ??tait `false`, #11646
- Correction d'un bug de style de ButtonGroup lorsqu'il n'a qu'un seul bouton `round` ou `circle`, #11605
- Correction du style du Select de Pagination, #11622
- Correction de la m??thode `open` du menu quand `collapse` est dynamiquement chang??, #11646
- Ajout des param??tres `activeName` et `oldActiveName` au hook before-leave de Tabs, #11713
- Correction de Cascader ayant le focus apr??s avoir cliqu?? ?? l'ext??rieur, #11588
- Correction de Cascader ne se fermant pas quand l'option est cliqu??e quand `change-on-select` est `true`, #11623
- La mise ?? jour programmatique de la valeur de Select d??clenchera la validation du formulaire, #11672

### 2.4.1

*2018-06-08*

- Suppression du duplicata de la d??claration de type pour Autocomplete, #11388
- Correction du style de fl??che d??roulante de Select dans FireFox lorsqu'il est imbriqu?? dans Form, #11427
- Correction de l'ic??ne de l'option de Select qui s'affiche toujours lorsque la valeur initiale est `null`, #11460
- Correction d'un Radio d??sactiv?? affichant l'ombre de la bo??te quand on clique dessus, #11462
- Ajout de l'attribut `iconClass` pour MessageBox, #11499
- Ajout de l'attribut `stretch` pour Tabs, #11476
- Correction d'un probl??me d'ordre de rendu de TabPane lorsque Tabs est `lazy`, #11461
- Correction de Table ne conservant pas la surbrillance de la ligne actuelle lors de son ouverture, #11464
- Correction de l'??tat de la mise au point lorsque `before-leave` renvoie une promesse r??solue, #11386
- Correction de la d??sactivation du Popover qui cr??ait encore des poppers, #11426
- Correction de la boucle sans fin de Tree lorsqu'un nouveau noeud est ajout?? en mode lazy, #11430 (par @wangjingf)
- Ajout de l'??v??nement `closed` pour Dialog, #11490

### 2.4.0 Fullerene

*2018-05-28*

#### Nouvelles fonctionnalit??s
- G??n??ral
  - L'outil de d??veloppement et le bundler sont bascul??s vers le webpack natif, #11216
  - Vous pouvez maintenant d??finir globalement l'index z initial des popups, #11257
- Autocomplete
  - Ajout de l'attribut `hide-loading`, #11260
- Button
  - Vous pouvez maintenant utiliser l'attribut `size` sur les boutons circulaires pour contr??ler leur taille, #11275
- InputNumber
  - Ajout de l'attribut `precision`, #11281
- Tabs
  - Ajout de l'attribut `before-leave`, #11259
  - Ajout de l'attribut `lazy`, #11167???by @Kingwl???
- Table
  - Ajout de la m??thode `sort` pour trier manuellement la table, #11311

#### Corrections de bugs
- Input
  - Correction d'un probl??me qui provoquait un re-rendu lors de l'utilisation de l'IME chinois pour saisir rapidement du texte, #11235 (par @STLighter)
- Popover
  - Correction de l'erreur de console lorsque l'??l??ment d??clencheur est Radio ou Checkbox, #11265
- Breadcrumb
  - Correction de l'attribut `to` ne supportant pas la mise ?? jour dynamique, #11286
- Upload
  - Correction de l'erreur de console lorsqu'un fichier est r??solu dans la promesse retourn??e de la m??thode `beforeUpload`, #11297 (par @qusiba)
- Infobulle
  - Correction d'une fl??che mal positionn??e lorsque le contenu est vide, #11335
- Autocomplete
  - Correction de suggestions d'entr??e incorrectes apr??s la suppression rapide d'un mot-cl??, #11323
- ColorPicker
  - Correction d'un ??v??nement `active-change` se d??clenchant incorrectement lorsque le menu d??roulant du picker est ferm??, #11304
- Table
  - Correction d'une erreur de style du panneau de filtre surdimensionn??, #11314
  - Correction de la ligne actuellement s??lectionn??e qui n'??tait pas conserv??e lors du tri de la table, #11348
- Checkbox
  - Correction d'une checkbox unique ne supportant pas la validation, #11271
- Radio
  - Correction du Radio d??sactiv?? quand m??me s??lectionn?? en appuyant sur la touche espace, #11303
- MessageBox
  - Correction de la classe `el-popup-parent-hidden` qui n'??tait pas supprim??e ?? l'ouverture successive de MessageBox, #11371

### 2.3.9

*2018-05-18*

- Correction d'une erreur lorsque les donn??es source n'ont pas le champ sp??cifi?? par l'attribut `prop` d'une TableColumn, lorsque la souris se d??place dans les cellules de cette colonne, #11137
- L'attribut `lockScroll` des composants popup n'ajoute plus un style en ligne ?? l'??l??ment parent, mais ajoute un nom de classe, #1111114
- Correction de l'ic??ne de Progression qui ne s'affichait pas quand son `status` ??tait une exception, #11172
- Correction de l'attribut `d??sactiv??` qui ne fonctionnait pas dans la liste des r??sultats de filtrage du Cascader filtrable, #11185
- Correction d'un probl??me o?? la ligne ??tendue de la table ne peut pas ??tre r??duite si la source de donn??es est mise ?? jour apr??s son extension, #11186
- `setCurrentKey` de Tree accepte maintenant `null` comme param??tre pour annuler le noeud actuellement mis en surbrillance, #11205

### 2.3.8

*2018-05-11*

- Correction du saut du panneau DatePicker au mois courant apr??s avoir choisi une date dans un mois non courant quand `type` est dates, #10973
- Correction de l'Input effa??able affichant toujours l'ic??ne d'effacement en lecture seule, #10912
- Correction de la fermeture du panneau DatePicker sans changer la valeur d??clenchant incorrectement l'??v??nement `change`, #11017
- Correction d'un probl??me de navigation du clavier lorsque Select a regroup?? les options, #11058
- Ajout du slot nomm?? `pr??fixe` pour Select, #11063
- Ajout de la m??thode `clearValidate` pour FormItem, #11076
- Ajout de l'attribut `checkOnClickNode` pour Tree, #1111111

### 2.3.7

*2018-04-29*

- Correction d'une table qui ne mettait pas ?? jour ses largeurs de headers lorsque la barre de d??filement disparaissait ?? cause du filtrage, #10834
- Correction de l'Input effa??able affichant toujours l'ic??ne d'effacement lorsque sa valeur initiale est `null`, #10912
- Correction d'un d??clencheur incorrect de l'??v??nement `active-change` apr??s avoir chang?? la valeur li??e de ColorPicker par programmation, #10903 (par @zhangbobell)
- Correction du Select filtrable qui provoquait une boucle infinie lors de la navigation dans les options ?? l'aide du clavier si toutes les options sont d??sactiv??es, #10945

### 2.3.6

*2018-04-21*

- Correction d'un comportement incorrect du callback `allow-drop` de Tree lorsque le param??tre `type` est utilis??, #10821
- Maintenant vous pouvez entrer correctement les mots-cl??s dans le Select simple filtrable dans IE11, #10822
- Correction d'un Select simple d??clenchant incorrectement un ??v??nement `blur` apr??s avoir cliqu?? sur une option, #10822

### 2.3.5

*2018-04-20*

- Correction d'une surbrillance incorrecte dans le panneau DatePicker lorsque `type` est la semaine, #10712
- Correction d'un InputNumber vide lorsque sa valeur initiale est 0, #10714
- Ajout de l'attribut `automatic-dropdown` pour Select, #10042 (par @Seebiscuit)
- Correction de Rate d??sactiv?? quand m??me mis ?? jour par les touches de navigation, #10726 (par @Richard-Choooou)
- L'attribut `type` de DatePicker peut ??tre `dates`, o?? vous pouvez choisir plusieurs dates dans un s??lecteur, #10650 (par @Mini256)
- Ajout des ??v??nements `prev-click` et `next-click` pour Pagination, #10755
- Ajout de l'attribut `pager-count` pour Pagination, #10493 (par @chongjohn716)
- Ajout de `type` comme 3??me param??tre de l'attribut `allow-drop` de Tree, #10792
- Nous utilisons maintenant ResizeObserver pour d??tecter le redimensionnement des ??l??ments DOM, #10779

### 2.3.4

*2018-04-12*

- Suppression du double de l'attribut `showTimeout` dans la d??claration TypeScript de SubMenu, #10566 (par @kimond)
- Vous pouvez maintenant personnaliser les ??l??ments de Transfert en utilisant le scoped slot, #10577
- Correction d'un clic sur le bouton pr??c??dent d??sactiv?? et le bouton suivant de la pagination d??clenchant toujours l'??v??nement `current-current-change`, #10628
- Correction de Textarea affichant `undefined` dans le SSR lorsque sa valeur n'est pas d??finie, #10630
- Correction de la d??sactivation du style TabItem lorsque `type` est border-card, #10640
- Ajout de `$index` comme quatri??me param??tre du `formatter` de la Table, #10645
- Correction de CheckboxButton non export?? dans la d??claration TypeScript, #10666

### 2.3.3

*2018-04-04*

- Ajout de l'attribut `shadow` pour Card, #10418 (par @YunYouJun)
- Correction de Badge masqu?? lorsque `value` est `0`, #10470
- Correction de quelques bugs de Tree, #10474 #10494
- Ajout de `placement` pour Autocomplete, #10475
- L'attribut `default-time` fonctionne ??galement dans DateTimePicker, #10321 (par @RickMacTurk)
- Suppression du contour bleu de TabItem apr??s que le navigateur n'ait plus le focus ou soit minimis??, #10503
- Ajout de l'attribut `popper-append-to-body` pour SubMenu, #10515
- Suppression du feedback visuel lors du survol d'un ??l??ment BreadcrumbItem non li??, #10551
- Correction de l'??v??nement `change` d'InputNumber pour s'assurer que la valeur li??e du composant est mise ?? jour dans le gestionnaire d'??v??nements, #10553

### 2.3.2

*2018-03-29*

- Correction d'une r??gression d'Autocomplete, #10442

### 2.3.1

*2018-03-29*

- Correction d'une r??gression de `type` d'Inputqui n'??tait pas transmis ?? l'??l??ment natif, #10415
- Ajout de la m??thode `blur` pour Select, #10416

#### 2.3.0 Diamant

*2018-03-28*

#### Nouvelles fonctionnalit??s
- Table
  - Maintenant le `formatter` de TableColumn peut ??tre mis ?? jour dynamiquement, #10184 (par @elfman)
  - Ajout de l'attribut `select-on-indeterminate`, #9924 (par @syn-zeta)
- Menu
  - Ajout de l'attribut `collapse-transition`, #8809 (par @limichange)
- Input
  - Ajout de la m??thode `select`, #10229
  - Ajout de la m??thode `blur`, #10356
- ColorPicker
  - Ajout de l'attribut `predefine`, #10170 (par @elfman)
- Tree
  - Ajout des attributs `draggable`, `allow-drop` et `allow-drag`, et `node-drag-start`, `node-drag-enter`, `node-drag-leave`, `node-drag-leave`, `node-drag-over`, `node-drag-end` et `node-drop`, #9251 #10372 (par @elfman)
- Form
  - La m??thode `validate` a maintenant un deuxi??me param??tre, contenant l'information des ??l??ments de formulaire qui ont ??chou?? ?? la validation, #10279
  - Ajout de l'??v??nement `validate`, #10351
- Progress
  - Ajout de l'attribut `color`, #10352 (par @YunYouJun)
- Button
  - Ajout de l'attribut `circle`, #10359 (par @YunYouJun)

#### Corrections de bugs
- Form
  - Correction du label de FormItem non align?? avec l'Input mixte, #10189
- Menu
  - D??sormais, le menu r??duit n'affichera la bulle d'aide que lorsque le slot `title` de l'??l??ment MenuItem est d??fini, #10193 (par @PanJiaChen).
- Pagination
  - Correction d'un ??v??nement `current-current-change` qui se d??clenchait incorrectement sans interaction de l'utilisateur, #10247
- DatePicker
  - Maintenant, la date et l'heure dans le panneau d??roulant sont correctement format??es en fonction de l'attribut `format`, #10174???by @remizovvv???
- Upload
  - Correction de l'attribut `accept` qui ne fonctionnait pas quand `drag` est vrai, #10278

### 2.2.2

*2018-03-14*

- Ajout de l'??v??nement `clear` pour Input, #9988 (par @blackmiaool)
- Maintenant la saisie manuelle de ColorPicker supporte les modes `hsl`, `hsv` et `rgb`, #9991
- Correction de DatePicker ne d??clenchant pas l'??v??nement `change` lorsque sa valeur initiale est effac??e, #9986
- Maintenant les attributs li??s ?? la classe d'ic??nes de Rate supportent les mises ?? jour dynamiques, #10003
- Correction de Table avec des colonnes fixes dont la hauteur n'est pas mise ?? jour correctement si `max-height` est r??gl??, #10034
- Maintenant le mode plage de DatePicker supporte la s??lection inverse (en cliquant sur la date de fin, puis sur la date de d??but), #8156 (par @earlymeme)
- Ajout de l'attribut `d??sactiv??` pour Pagination, #10006
- Ajout des ??v??nements `after-enter` et `after-leave` pour Popover, #10047
- Correction de Select ne d??clenchant pas la validation lorsque l'utilisateur s??lectionne une option apr??s avoir ex??cut?? `resetFields` du formulaire, #10105
- Correction des largeurs incorrectes des colonnes fixes de Table dans certains cas, #10130
- Correction de MessageBox h??ritant de l'attribut `title` de son instance pr??c??dente lorsqu'il ??tait appel?? sans `title`, #10126 (par @Pochodaydaydayup)
- Ajout de l'attribut `input-size` pour Slider, #10154
- Ajout des ??v??nements `left-check-change` et `right-check-change` pour Transfer, #10156

### 2.2.1

*2018-03-02*

- Correction d'un r??tr??cissement de Aside, Header et Footer dans certaines mises en page, #9812
- Correction de Table avec un attribut `height` qui ne rendait pas dans SSR, #9876
- Correction d'une Table extensible ne calculant pas sa hauteur lorsqu'une rang??e est agrandie, #9848
- Correction d'un ??v??nement `change` qui ne se d??clenchait pas lors de la saisie manuelle de la date dans DateTimePicker, #9913
- Correction de Select affichant ses options lorsque la bo??te de saisie est cliqu??e avec le bouton droit de la souris, #9894 (par @openks)
- Ajout de l'attribut `tooltip-class` pour Slider, #9957
- Maintenant Select garde le focus apr??s la s??lection, #9857 (par @Seebiscuit)
- Ajout de l'attribut `target-order` pour Transfer, #9960

### 2.2.0 Graphite

*2018-02-12*

#### Nouvelles fonctionnalit??s
- Menu
  - Ajout des attributs `popper-class` et `disabled` pour le sous-menu, #9604 #9771
  - Le menu horizontal prend maintenant en charge le sous-menu multicouche, #9741
- Tree
  - Ajout de l'??v??nement `node-contextmenu`, #9678
  - Vous pouvez maintenant personnaliser le mod??le de n??ud en utilisant un slot avec port??e, #9686
  - Ajout des m??thodes `getNode`, `remove`, `remove`, `append`, `insertBefore`, `insertAfter`, `getCheckedKeys`, `getHalfCheckedNodes`, `getHalfCheckedNodes`, `getHalfCheckedKeys` et de l'??v??nement `check`, #9718 #9730
- Transfer
  - Ajout de la m??thode `clearQuery`, #9753
- Select
  - Ajout de l'attribut `popper-append-to-body`, #9782

#### Corrections de bugs
- Table
  - Correction d'un clic sur l'ic??ne d'expansion d'une ligne extensible qui d??clenche l'??v??nement `row-click`, #9654
  - Correction de la mise en page non mise ?? jour lorsque la largeur des colonnes est modifi??e par glisser-d??poser de l'utilisateur, #9668
  - Correction d'un probl??me de style lorsque la ligne de r??sum?? coexiste avec des colonnes fixes, #9667
- Container
  - Les composants fixes de Container ne s'??tirent pas dans IE11, #9655
- Loading
  - Correction du chargement n'apparaissant pas lorsque la valeur de `v-loading` est chang??e en true dans le hook `mounted`, #9722
- Switch
  - Correction de deux ??v??nements de clics natifs d??clench??s lorsque Switch est cliqu??, #9760

### 2.1.0 Charcoal

*2018-01-31*

#### Nouvelles fonctionnalit??s
- Cascader
  - Ajout des ??v??nements `focus` et `blur`, #9184 (par @viewweiwu)
- Table
  - La m??thode `filter-method` a maintenant un troisi??me param??tre `column`, #9196 (par @liyanlong)
- DatePicker
  - Ajout des attributs `prefix-icon` et `clear-icon`, #9237 (par @AdamSGit)
  - Ajout de l'attribut `default-time`, #9094 (par @nighca)
  - Le format `value-format` supporte maintenant `timestamp`, #9319 (par @wacky6)
- InputNumber
  - Maintenant la valeur li??e peut ??tre `undefined`, #9361
- Select
  - Ajout?? l'attribut `auto-complete`, #9388
- Form
 - Ajout de l'attribut `d??sactiv??`, #9529
 - Ajout de l'attribut `validateOnRuleChange`, #8141
- Notification
  - Ajout de la m??thode `closeAll`, #9514

#### Corrections de bugs
- InputNumber
  - Correstion du reset lors de la saisie du point des nombres d??cimaux, #9116
- Dropdown
  - Correction du mauvais positionnement du menu d??roulant lorsque la page n'a qu'une barre de d??filement horizontale dans certains navigateurs, #9138 (par @banzhuanmei)
- Table
  - Correction d'une erreur dans le calcul du nombre de colonnes fixes apr??s les changements de donn??es des colonnes, #9188???by @kolesoffac???
  - Correction de la bordure de la derni??re colonne de l'en-t??te group?? qui n'??tait pas correctement affich??e, #9326
  - Correction d'un positionnement incorrect de l'en-t??te du tableau dans Safari, #9327
  - Correction de la r??duction des lignes extensibles lorsque les donn??es de la table changent, #9462
  - Correction de rendus multiples inutiles dans certaines conditions, #9426
  - Correction d'une erreur de calcul de la largeur de colonne lors de la modification de `width` de TableColumn, #9426
- Loading
  - Correction de Loading ne se cachant pas correctement dans certaines conditions, #9313
- DatePicker
  - Correction de la m??thode `focus` qui ne fonctionnait pas en mode "range", #9437
  - Correction du clic sur le bouton "now" qui s??lectionnait toujours la date actuelle m??me si elle ??tait d??sactiv??e, #9470 (par @wacky6)
  - Correction d'une date trop serr??e lors de la navigation, #9577 (par @wacky6)
- Steps
  - Correction d'une erreur de style dans IE 11, #9454

#### Changements
- Menu
  - Le menu contextuel en mode `collapse` s'ajoute maintenant directement ?? `body`, de sorte qu'il est visible lorsqu'il est imbriqu?? dans Aside, #9263
- Table
  - Maintenant, cocher les cases dans la Table multi-s??lection ne d??clenche pas l'??v??nement `row-click`, #9467
- Loading
  - Le `z-index` du masque de chargement non plein ??cran est chang?? ?? 2000. Le `z-index` du masque de chargement plein ??cran se mettra ?? jour dynamiquement avec les composants popup, #9522
- Dropdown
  - Les attributs `show-timeout` et `hide-timeout` ne fonctionnent maintenant que lorsque le d??clencheur est `hover`, #9573

### 2.0.11

*2018-01-08*

- Correction d'un probl??me de couleur de bordure de Select dans les slots `prepend` ou `append` de Input, #9089
- Correction du param??tre `remove-tag` de l'??v??nement Select, #909090
- Ajout des attributs `show-timeout` et `hide-timeout` pour le sous-menu, #8934 (par @HugoLew)
- Correction d'un style Tooltip manquant de `show-overflow-tooltip` lors de l'importation de Table sur demande, #9130
- Correction d'un dysfonctionnement du tri des colonnes de la table apr??s l'ex??cution de `clearSort` sur cette colonne, #9100 (par @zEmily)
- Le fichier de configuration i18n pour le tch??que est renomm?? de `cz` en `cs-CZ`, #9164

### 2.0.10

*2017-12-29*

- Calcul erron?? de la hauteur du tableau lorsque la colonne fixe et la ligne de somme coexistent, #9026
- Correction d'un style de couleur non compil?? du texte vide dans le tableau, #9028
- Maintenant, DatePicker n'??met que l'??v??nement `change` quand la valeur est vraiment chang??e, #9029 (par @remizovvvv)
- Ajout de l'attribut `tabindex` pour Input, #9041 (par @dicklwm)

### 2.0.9????

*2017-12-24*

- Ajout?? la fonction de hook "avant suppression" pour Upload, #8788 (par @firesh)
- Correction de la valeur initiale de `error` qui ne fonctionnait pas pour FormItem, #8840
- La directive Loading prend maintenant en charge le nom de classe personnalis?? gr??ce ?? l'attribut `element-loading-custom-class`, #8826 (par @earlymeme)
- Correction CarouselItem devenant invisible lorsque les donn??es sont mises ?? jour de mani??re asynchrone, #8921
- Ajout de l'attribut `renderAfterExpand` pour Tree, #8972

### 2.0.8

*2017-12-12*

- Ajout de la documentation en espagnol
- Correction du `show-timeout` de Dropdown qui ne fonctionnait pas quand le d??clencheur est click, #8734 (par @presidenten)
- Correction du temps de validation des formulaires pour les r??gles dont le d??clencheur est blur, #8776
- Correction d'un ??v??nement de blur de DatePicker avec intervalle, #8784
- L'attribut `format` de TimePicker supporte maintenant AM/PM, #8620 (par @firesh)

### 2.0.7

*2017-11-29*

- Correction du style du bouton de type texte d??sactiv??, #8570

### 2.0.6

*2017-11-29*

- Correction d'un bug de style des ic??nes de tri de la table, #8405
- Correction du m??canisme de d??clenchement de Popover lorsque son `trigger` est manuel, #8467
- Ajout des attributs `prefix-icon` et `suffix-icon` pour Autocomplete, #8446 (par @liyanlong)
- Ajout de l'attribut `separator` pour Cascader, #8501
- Ajout de l'attribut `clearable` pour Input, #8509 (par @lbogdan)
- Ajout de l'attribut `background` pour Pagination, #8553

### 2.0.5

*2017-11-17*

- Correction de la r??gression Popover, Tree, Breadcrumb et Cascader dans 2.0.4, #8188 #8217 #8283
- Correction d'une fuite de m??moire de la directive `clickoutside`, #8168 #8225 (par @badpunman @STLighter)
- Correction de la hauteur du Select multiple lorsque sa valeur est effac??e, #8317 (par @luciy)
- Ajout de l'attribut `collapse-tags` pour plusieurs S??lectionner pour remplacer les balises par une ligne de texte, #8190
- Correction d'une consommation CPU ??lev??e caus??e par la table cach??e, #8351
- Maintenant vous pouvez utiliser la m??thode `doLayout` de la Table pour mettre ?? jour sa disposition, #8351

### 2.0.4

*2017-11-10*

- Accessibilit?? am??lior??e pour Cascader, Dropdown, Message, Notification, Popover, Tooltip et Tree.
- Correction du redimensionnement de Container lorsque la largeur de la fen??tre d'affichage diminue, #8042
- Correction de la suppression incorrecte de `updateKeyChildren` dans Tree, #8100
- Correction de la hauteur de la CheckboxButton avec bordure lorsque le bouton est imbriqu?? dans un formulaire, #8100
- Correction d'une erreur d'analyse du menu pour les couleurs personnalis??es, #8153 (par @zhouyixiang)

### 2.0.3

*2017-11-03*

- Correction des attributs `??ditable` et `readonly` pour DatePicker avec intervalle, #7922
- Correction d'une erreur de style des Tabs imbriqu??s, #7941
- Correction d'une erreur de style de la derni??re ??tape des Steps verticales, #7980
- Correction de la synchronisation du d??clenchement de l'??v??nement `current-current-change` pour Pagination, #7995
- Correction d'une infobulle non enregistr??e dans Menu, #7995

### 2.0.2

*2017-10-31*

- Un clic droit sur les boutons de InputNumber ne changera pas sa valeur, #7817
- La m??thode `validate` de Form peut maintenant attendre des validations asynchrones avant d'ex??cuter son callback, #7774 (par @Allenice)
- Correction de la plage de s??lection de DatePicker ne fonctionnant pas dans les navigateurs Chromium 53-57, #7838
- Correction des ic??nes manquantes de pr??visualisation et de suppression de Upload lorsque son `list-type` est picture-card, #7857
- Ajout de l'attribut `sort-by` pour TableColumn, #7828 (par @wangfengming)
- Correction de DatePicker affichant parfois un mauvais num??ro d'ann??e lors de la s??lection de la premi??re semaine en mode semaine, #7860 (par @hhh23485)
- Correction d'une erreur de style d'ic??ne des Steps verticales, #7891
- La 'hot area' pour les fl??ches de n??ud dans Tree est ??tendue, #7891

### 2.0.1

*2017-10-28*

- Correction d'une erreur de style de RadioButton et CheckboxButton, #7793
- Correction de TimePicker qui ne r??pondait pas au d??filement de la souris dans certaines conditions, #7811
- Correction des styles incomplets de certains composants lors de l'importation ?? la demande, #7811

### 2.0.0 Carbon

*2017-10-27*

#### Nouvelles fonctionnalit??s
- G??n??ral
  - Un nouveau th??me : `theme-chalk`.
  - L'accessibilit?? des ??l??ments suivants est am??lior??e : Alert, AutoComplete, Breadcrumb, Button, Checkbox, Collapse, Input, InputNumber, Menu, Progress, Radio, Rate, Slider, Switch, Upload
  - Ajout du typage TypeScript
  - Toutes les ic??nes existantes sont redessin??es. De nouvelles ic??nes sont ajout??es
  - Ajout d'une s??rie de classes bas??es sur les breakpoints qui masquent les ??l??ments lorsque la taille de la fen??tre remplit certaines conditions
  - Ajout des composants de mise en page : Container, Header, Aside, Main, Footer
  - Vous pouvez maintenant configurer la taille des composants de mani??re globale. Lors de l'importation d'un ??l??ment, vous pouvez ajouter un objet de configuration global avec une propri??t?? `size` pour configurer les tailles par d??faut pour tous les composants.
- Button
  - Ajout de l'attribut `round`. Il est utilis?? pour les boutons ?? coins ronds #6643
- TimeSelect
  - Vous pouvez maintenant naviguer en appuyant sur les touches `Up` et `Down`, et en appuyant sur `Enter` vous s??lectionnez l'heure #6023.
- TimePicker
  - Vous pouvez maintenant naviguer ?? l'aide des touches fl??ch??es, et en appuyant sur `Entr??e` vous s??lectionnez l'heure #6050.
  - Ajout de `start-placeholder` et de `end-placeholder`. Ce sont des placeholders pour les deux champs en mode intervalle #7169
  - Ajout de l'attribut `farrow-control` pour faire tourner le temps avec les fl??ches #7438
- Tree
  - Maintenant les noeuds enfants ne font pas de rendu avant la premi??re ouverture #6257
  - Ajout de l'attribut `check-descendants`. Il d??termine si les n??uds enfants sont v??rifi??s lors du contr??le de leur n??ud parent en mode `lazy` #6235
- Tag
  - Ajout?? l'attribut `size` #7203
- Datepicker
  - Maintenant `timeFormat` peut formater le TimePicker quand le type est r??gl?? sur `datetimerange` #6052
  - Ajout de `start-placeholder` et de `end-placeholder`. Ce sont des placeholders pour les deux champs en mode intervalle #7169
  - Ajout de l'attribut `value-format` pour personnaliser le format de la valeur li??e, #7367
  - Ajout de l'attribut `unlink-panels` pour dissocier les deux panneaux de date lors de la s??lection d'une plage de dates
- MessageBox
  - Ajout de l'attribut `closeOnHashChange` #6043
  - Ajout de l'attribut `center` pour que le contenu puisse ??tre centr?? #7029
  - Ajout de l'attribut `roundButton` pour afficher les boutons ronds #7029
  - Ajout de l'attribut `dangerouslyUseHTMLString`. Lorsqu'il est r??gl?? sur `true`, `message` sera interpr??t?? comme une cha??ne HTML<sup>\*</sup> #6043
  - Ajout de l'attribut `inputType` pour assigner le type de l'input int??rieur, #7651
- Dialog
  - Ajout des attributs `width`???`fullscreen`???`append-to-body`. La bo??te de dialogue peut maintenant ??tre imbriqu??e
  - Ajout de l'attribut `center` pour que le contenu puisse ??tre centr?? #7042
  - Ajout de `focus-after-closed`???`focus-after-open` pour am??liorer l'accessibilit?? #6511
- ColorPicker
  - Maintenant vous pouvez taper les couleurs dans le champ de saisie #6167
  - Ajout des attributs `size` et `disabled` #7026
  - Ajout de l'attribut `popper-class` #7351
- Message
  - Maintenant la couleur des ic??nes peut ??tre modifi??e par CSS #6207
  - Ajout de l'attribut `dangerouslyUseHTMLString`. Lorsqu'il est r??gl?? sur `true`, `message` sera interpr??t?? comme une cha??ne HTML<sup>\*</sup> #6207
  - Ajout de l'attribut `center` pour que le contenu puisse ??tre centr?? #6875
- Notification
  - Ajout de l'attribut `position` pour configurer o?? Notification appara??t #6231
  - Ajout de l'attribut `dangerouslyUseHTMLString`. Lorsqu'il est r??gl?? sur `true`, `message` sera interpr??t?? comme une cha??ne HTML<sup>\*</sup> #6231
  - Ajout de l'attribut `showClose` pour cacher le bouton de fermeture #6402
- Rate
  - Ajout de l'attribut `show-score` pour d??terminer si le score actuel est affich?? #6295
- Tabs
  - Ajout de l'attribut `tab-position` #6096
- Radio
  - Ajout des attributs `border` et `size` #6690
- Checkbox
  - Ajout des attributs `border` et `size` #6690
- Alert
  - Ajout de l'attribut `center` pour que le contenu puisse ??tre centr?? #6876
- Menu
  - Ajout des attributs `background-color`, `text-color` et `active-text-color` #7064
  - Ajout des m??thodes `open` et `close` pour ouvrir et fermer les sous-menus par programmation, #7412
- Form
  - Ajout de l'attribut `inline-message` pour d??terminer si le message de validation est affich?? en ligne #7032
  - Ajout de l'attribut `status-icon` pour afficher une ic??ne de feedback apr??s validation #7032
  - Form et FormItem ont maintenant un attribut `size`. Les composants internes h??riteront de cette taille s'ils ne sont pas sp??cifi??s sur eux-m??mes, #7428
  - La m??thode `validate` retournera maintenant une promesse si le rappel est omis, #7405
  - Ajout de la m??thode `clearValidate` pour la validation des r??sultats pour tous les ??l??ments de formulaire, #7623
- Input
  - Ajout des attributs `suffixe` et `pr??fixe` des slots nomm??s, `suffixIcon` et `prefixIcon` pour ajouter du contenu dans la zone de saisie #7032
- Breadcrumb
  - Ajout de l'attribut `separator-class` pour supporter les ic??nes comme s??parateurs d'??l??ments #7203
- Steps
  - Ajout de l'attribut `simple` pour activer les ??tapes de style simple #7274
- Pagination
  - Ajout des attributs `prev-text` et `next-text` pour personnaliser les textes des pages pr??c??dente et suivante #7005
- Loading
  - Maintenant vous pouvez personnaliser l'ic??ne et la couleur de fond avec les propri??t??s `spinner` et `background` #7390
- Autocomplete
  - Ajout de l'attribut `debounce`, #7413
- Upload
  - Ajout des attributs `limit` et `on-exceed` pour limiter le nombre de fichiers, #7405
- DateTimePicker
  - Ajout de l'attribut `time-arrow-control` pour activer `arrow-control` du TimePicker imbriqu??, #743838
- Layout
  - Ajout d'un nouveau point d'arr??t `xl` pour les fen??tres plus larges que 1920px
- Table
  - Ajout de l'attribut `span-method` pour la fusion de cellules
  - Ajout de la m??thode `clearSort` pour effacer le tri par programmation
  - Ajout de la m??thode `clearFilter` pour effacer le filtre par programmation
  - Pour les lignes extensibles, lorsqu'une ligne est ??tendue, une classe `.expanded` sera ajout??e ?? sa liste de classes, afin que vous puissiez personnaliser son style
  - Ajout de l'attribut `size`
  - Ajout de la m??thode `toggleRowExpansionRowExpansion` pour ouvrir ou r??duire les lignes extensibles par programmation
  - Ajout de l'attribut `cell-class-name` pour assigner un nom de classe aux cellules
  - Ajout de l'attribut `cell-style` pour le style des cellules
  - Ajout de l'attribut `header-row-class-name` pour assigner un nom de classe aux lignes d'en-t??te
  - Ajout de l'attribut `header-row-style` pour le style d'en-t??te
  - Ajout de l'attribut `header-cell-class-name` pour assigner un nom de classe aux cellules d'en-t??te
  - Ajout de l'attribut `header-cell-style` pour le style des cellules d'en-t??te
  - L'attribut `prop` de la tableColumn accepte maintenant les notations `object[key]`
  - Ajout de l'attribut `index` pour TableColumn pour personnaliser les index de lignes
- Select
  - Ajout de l'attribut `reserve-keyword` pour r??server le mot-cl?? de la recherche courante apr??s avoir s??lectionn?? une option.

#### Corrections de bugs
- DatePicker
  - Correction de `v-model` retournant le deuxi??me jour de la semaine s??lectionn??e en mode semaine #6038
  - Correction de la premi??re entr??e effac??e dans le type `daterange` #6021
- DateTimePicker
  - Correction de DateTimePicker et TimePicker s'affectant l'un l'autre lors de la s??lection #6090
  - Correction de l'heure et de la seconde qui peuvent ??tre au-del?? de la limite en s??lectionnant l'heure #6076
- TimePicker
  - Correction de `v-model` qui ne se mettait pas ?? jour correctement lors du blur #6023
- Dialog
  - Correction des textes ayant des bords flous lors de l'ouverture et de la fermeture des listes d??roulantes imbriqu??es #6088
- Select
  - Performances am??lior??es. Maintenant Vue dev-tool ne crashera pas quand un grand nombre de Select sont d??truits #6151
- Table
  - Correction d'un bug ou la table reste masqu??e lorsque son ??l??ment parent appara??t depuis `display : none`
  - Correction de l'extension de la largeur de la table lorsque l'??l??ment parent a `display : flex`
  - Correction d'un bug qui corrigeait le fait que les colonnes d'une table avec l'emplacement `append` disparaissaient lorsque les donn??es ??taient r??cup??r??es dynamiquement
  - Correction de l'attribut `expand-row-keys` qui ne fonctionnait pas avec la valeur initiale
  - Correction d'une d??faillance du filtre lors de la mise ?? jour de `data`
  - Correction d'une erreur de calcul dans la mise en page des colonnes fixes avec en-t??tes group??s
  - Correction d'un bug dynamique de `max-height`
  - Correction de quelques erreurs de calcul de style

#### Breaking changes
- G??n??ral
  - Suppression de `theme-default`.
  - Compatible avec Vue 2.5.2+ et IE 10+
  - L'??v??nement `change` des composants de formulaire et l'??v??nement `current-current-change` de la pagination ne se d??clenchent plus que lors de l'interaction de l'utilisateur
  - L'attribut `size` de Button et les composants de formulaire acceptent maintenant `medium`, `small` et `mini`
  - Pour faciliter l'utilisation d'ic??nes tierces, les attributs `icon` du bouton et des ??tapes, `prefix-icon` et `suffix-icon` d'Input n??cessitent maintenant un nom de classe complet
- Dialog
  - Suppression de l'attribut `taille`. Maintenant la taille de Dialog peut ??tre configur??e par `width` et `fullscreen`
  - Maintenant la visibilit?? de Dialog ne peut plus ??tre contr??l??e par `v-model`
- Rate
  - Le `text-template` est renomm?? `score-template`
- Dropdown
  - `menu-align` est renomm?? en `placement`. Maintenant il supporte plus de positions
- Transfert
  - le `footer-format` est renomm?? en `format`
- Switch
  - Les attributs commen??ant par `on-**` seront analys??s pour les ??v??nements dans JSX, ce qui rend tous les attributs `on-*` de Switch incapable de fonctionner en JSX. Ainsi, les attributs `on-**` sont renomm??s en `active-*`, et par cons??quent les attributs `off-*` sont renomm??s en `inactive-*`. Cette modification affecte les attributs suivants: `on-icon-class`, `off-icon-class`, `on-text`, `off-text`, `off-text`, `on-color`, `off-color`, `on-value`, `off-value`
  - Les attributs `active-text` et `inactive-text` n'ont plus de valeurs par d??faut
- Tag
  - L'attribut `type` accepte maintenant `success`, `info`, ` warning` et `danger`
- Menu
  - Suppression de l'attribut `theme`. La couleur du menu peut ??tre configur??e en utilisant `background-color`, `text-color` et `active-text-color`
- Input
  - Suppression de l'attribut `icon`. L'ic??ne du suffixe peut maintenant ??tre configur??e ?? l'aide de l'attribut `suffix-icon` ou du slot `suffix-icon`
  - Suppression de l'attribut `on-icon-click` et de l'??v??nement `click`. Maintenant pour ajouter le gestionnaire de clic sur les ic??nes, veuillez utiliser les slots nomm??s
  - L'??v??nement `change` se comporte maintenant comme dans l'input natif, qui ne se d??clenche qu'en cas de blur ou en appuyant sur Entr??e. Si vous avez besoin de r??pondre ?? l'entr??e de l'utilisateur en temps r??el, vous pouvez utiliser l'??v??nement `input`
- Autocomplete
  - Suppression de l'attribut `custom-item`. Le template de suggestions d'entr??e peut maintenant ??tre personnalis?? en utilisant `scoped slot`.
  - Suppression de l'attribut `props`. Vous pouvez maintenant utiliser l'attribut `value-key` pour d??signer le nom de cl?? de l'objet de suggestion d'entr??e pour l'affichage.
- Steps
  - Suppression de l'attribut `center`
  - Maintenant le Steps va remplir son conteneur parent par d??faut
- DatePicker
  - Le param??tre de l'??v??nement `change` de DatePicker est maintenant la valeur li??e elle-m??me. Son format est contr??l?? par `value-format`
- Table
  - Suppression de la prise en charge de la personnalisation du mod??le de colonne ?? l'aide de `inline-template`
  - `sort-method` s'aligne maintenant avec `Array.sort`. Il devrait retourner un nombre au lieu d'un bool??en
  - L'emplacement `append` est d??plac?? ?? l'ext??rieur de l'??l??ment `tbody` pour ??viter les rendus multiples
  - L'??v??nement `expand` est renomm?? en `expand-change`
  - Les param??tres de la m??thode `row-class-name` et `row-style` sont maintenant un objet

##
<i><sup>*</sup> Rendre du HTML arbitraire de fa??on dynamique sur votre site Web peut ??tre tr??s dangereux car cela peut facilement mener ??[des attaques XSS](https://en.wikipedia.org/wiki/Cross-site_scripting). Donc quand `dangerouslyUseHTMLString' est activ??, assurez-vous que le contenu du `message' est fiable, et **ne jamais** assigner `message` au contenu fourni par l'utilisateur.</i>.
