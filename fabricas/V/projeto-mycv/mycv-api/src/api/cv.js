const restful = require('node-restful');
const mongoose = restful.mongoose;

const cvBase = new mongoose.Schema({
    name: { type: String, required: true },
    email: { type: String, required: true },
    phone: { type: String },
    linkedin: { type: String },
    site: { type: String },
    description: { type: String, required: true },
    objective: { type: String, required: true },
    status: { type: String, uppercase: true, enum: ['PENDENTE', 'FINIZADO', 'PUBLICADO'] },
    experiences: [expirienceSchema],
    academic: [academicSchema],
    skills: [skillSchema],
    languages: [languagesSchema]
});

const expirienceSchema = new mongoose.Schema({
    name: { type: String },
    description: { type: String },
    office: { type: String },
    date_init: { type: Date },
    date_end: { type: Date },
});

const academicSchema = new mongoose.Schema({
    name: { type: String },
    description: { type: String },
    instituite: { type: String },
    office: { type: String },
    date_init: { type: Date },
    date_end: { type: Date },
});

const skillSchema = new mongoose.Schema({
    name: { type: String },
    level: { type: String, uppercase: true, enum: ['BÁSICO', 'INTERMEDIARIO', 'AVANÇADO'] }
});

const languagesSchema = new mongoose.Schema({
    name: { type: String },
    percent: { type: Number }
});


module.exports = restful.model('cv', cvBase);