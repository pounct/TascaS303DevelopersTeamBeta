CREATE DATABASE 'floristeríadb'

use('floristeríadb');

db.createCollection('compra',{ validatorFilterDefinition: { $jsonSchema: {
  "bsonType": "object",
  "required": [
    "id",
    "dateC"
  ],
  "properties": {
    "dateC": {
      "bsonType": "date"
    },
    "id": {
      "bsonType": "int"
    }
  }
} }});

db.getCollection('compra').createIndex( { 'id':1 } , { name:'ind'} );

db.createCollection('floristeria',{ validatorFilterDefinition: { $jsonSchema: {
  "bsonType": "object",
  "required": [
    "id",
    "nom"
  ],
  "properties": {
    "id": {
      "bsonType": "int"
    },
    "nom": {
      "bsonType": "string"
    }
  }
} }});

db.getCollection('floristeria').createIndex( { 'id':1 } , { name:'ind'} );

db.createCollection('producte',{ validatorFilterDefinition: { $jsonSchema: {
  "bsonType": "object",
  "required": [
    "id",
    "designacio"
  ],
  "properties": {
    "designacio": {
      "bsonType": "string"
    },
    "id": {
      "bsonType": "int"
    }
  }
} }});

db.getCollection('producte').createIndex( { 'id':1 } , { name:'ind'} );

db.createCollection('venda',{ validatorFilterDefinition: { $jsonSchema: {
  "bsonType": "object",
  "required": [
    "id",
    "dateV"
  ],
  "properties": {
    "dateV": {
      "bsonType": "date"
    },
    "id": {
      "bsonType": "int"
    }
  }
} }});

db.getCollection('venda').createIndex( { 'id':1 } , { name:'ind'} );

db.createCollection('arbre',{ validatorFilterDefinition: { $jsonSchema: {
  "bsonType": "object",
  "required": [
    "id",
    "alcada"
  ],
  "properties": {
    "alcada": {
      "bsonType": "double"
    },
    "id": {
      "bsonType": "int"
    }
  }
} }});

db.createCollection('decoracio',{ validatorFilterDefinition: { $jsonSchema: {
  "bsonType": "object",
  "required": [
    "id",
    "material"
  ],
  "properties": {
    "material": {
      "enum": [
        "fusta",
        "plàstic"
      ]
    },
    "id": {
      "bsonType": "int"
    }
  }
} }});

db.createCollection('flor',{ validatorFilterDefinition: { $jsonSchema: {
  "bsonType": "object",
  "required": [
    "id",
    "color"
  ],
  "properties": {
    "color": {
      "bsonType": "string"
    },
    "id": {
      "bsonType": "int"
    }
  }
} }});

db.createCollection('liniacompra',{ validatorFilterDefinition: { $jsonSchema: {
  "bsonType": "object",
  "required": [
    "id",
    "preu",
    "producteId",
    "floresteriaId",
    "compraId"
  ],
  "properties": {
    "floresteriaId": {
      "bsonType": "int"
    },
    "preu": {
      "bsonType": "double"
    },
    "id": {
      "bsonType": "int"
    },
    "producteId": {
      "bsonType": "int"
    },
    "compraId": {
      "bsonType": "int"
    }
  }
} }});

db.getCollection('liniacompra').createIndex( { 'compraId':1 } , { name:'compraId'} );

db.getCollection('liniacompra').createIndex( { 'producteId':1 } , { name:'producteId'} );

db.getCollection('liniacompra').createIndex( { 'floresteriaId':1 } , { name:'floresteriaId'} );

db.createCollection('liniavenda',{ validatorFilterDefinition: { $jsonSchema: {
  "bsonType": "object",
  "required": [
    "id",
    "preu",
    "producteId",
    "vendaId",
    "floresteriaId"
  ],
  "properties": {
    "vendaId": {
      "bsonType": "int"
    },
    "floresteriaId": {
      "bsonType": "int"
    },
    "preu": {
      "bsonType": "double"
    },
    "id": {
      "bsonType": "int"
    },
    "producteId": {
      "bsonType": "int"
    }
  }
} }});

db.getCollection('liniavenda').createIndex( { 'vendaId':1 } , { name:'vendaId'} );

db.getCollection('liniavenda').createIndex( { 'producteId':1 } , { name:'producteId'} );

db.getCollection('liniavenda').createIndex( { 'floresteriaId':1 } , { name:'floresteriaId'} );
