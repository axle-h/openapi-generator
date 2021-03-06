---
title: Config Options for javascript-flowtyped
sidebar_label: javascript-flowtyped
---

| Option | Description | Values | Default |
| ------ | ----------- | ------ | ------- |
|sortParamsByRequiredFlag|Sort method arguments to place required parameters before optional parameters.| |true|
|sortModelPropertiesByRequiredFlag|Sort model properties to place required parameters before optional parameters.| |true|
|ensureUniqueParams|Whether to ensure parameter names are unique in an operation (rename parameters that are not).| |true|
|allowUnicodeIdentifiers|boolean, toggles whether unicode identifiers are allowed in names or not, default is false| |false|
|prependFormOrBodyParameters|Add form or body parameters to the beginning of the parameter list.| |false|
|modelPropertyNaming|Naming convention for the property: 'camelCase', 'PascalCase', 'snake_case' and 'original', which keeps the original name| |camelCase|
|supportsES6|Generate code that conforms to ES6.| |false|
|npmName|The name under which you want to publish generated npm package. Required to generate a full package| |null|
|npmVersion|The version of your npm package. If not provided, using the version from the OpenAPI specification file.| |1.0.0|
|snapshot|When setting this property to true, the version will be suffixed with -SNAPSHOT.yyyyMMddHHmm| |false|
|npmRepository|Use this property to set an url your private npmRepo in the package.json| |null|

## IMPORT MAPPING

| Type/Alias | Imports |
| ---------- | ------- |


## INSTANTIATION TYPES

| Type/Alias | Instantiated By |
| ---------- | --------------- |
|array|Array|
|list|Array|
|map|Object|


## LANGUAGE PRIMITIVES

<ul data-columns="2" style="list-style-type: disc;-webkit-columns:2;-moz-columns:2;columns:2;-moz-column-fill:auto;column-fill:auto"><li>Array</li>
<li>number</li>
<li>Blob</li>
<li>boolean</li>
<li>string</li>
<li>Object</li>
<li>File</li>
<li>Date</li>
</ul>

## RESERVED WORDS

<ul data-columns="2" style="list-style-type: disc;-webkit-columns:2;-moz-columns:2;columns:2;-moz-column-fill:auto;column-fill:auto"><li>date</li>
<li>synchronized</li>
<li>requestoptions</li>
<li>debugger</li>
<li>isfinite</li>
<li>do</li>
<li>float</li>
<li>while</li>
<li>hasownproperty</li>
<li>number</li>
<li>protected</li>
<li>continue</li>
<li>else</li>
<li>function</li>
<li>let</li>
<li>nan</li>
<li>catch</li>
<li>export</li>
<li>if</li>
<li>case</li>
<li>new</li>
<li>package</li>
<li>static</li>
<li>void</li>
<li>in</li>
<li>byte</li>
<li>double</li>
<li>var</li>
<li>finally</li>
<li>this</li>
<li>isprototypeof</li>
<li>throws</li>
<li>formparams</li>
<li>enum</li>
<li>headerparams</li>
<li>varlocaldeferred</li>
<li>useformdata</li>
<li>eval</li>
<li>extends</li>
<li>null</li>
<li>transient</li>
<li>final</li>
<li>true</li>
<li>try</li>
<li>math</li>
<li>varlocalpath</li>
<li>object</li>
<li>implements</li>
<li>private</li>
<li>const</li>
<li>import</li>
<li>string</li>
<li>queryparameters</li>
<li>valueof</li>
<li>for</li>
<li>interface</li>
<li>isnan</li>
<li>delete</li>
<li>long</li>
<li>switch</li>
<li>undefined</li>
<li>default</li>
<li>goto</li>
<li>public</li>
<li>native</li>
<li>array</li>
<li>yield</li>
<li>class</li>
<li>typeof</li>
<li>break</li>
<li>false</li>
<li>volatile</li>
<li>abstract</li>
<li>prototype</li>
<li>int</li>
<li>instanceof</li>
<li>super</li>
<li>with</li>
<li>boolean</li>
<li>throw</li>
<li>char</li>
<li>short</li>
<li>arguments</li>
<li>infinity</li>
<li>tostring</li>
<li>return</li>
</ul>
